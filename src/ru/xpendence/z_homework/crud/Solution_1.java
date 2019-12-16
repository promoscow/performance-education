package ru.xpendence.z_homework.crud;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 12.12.19
 * Time: 16:51
 * e-mail: slava_rossii@list.ru
 */

/* CRUD
CrUD - Create, Update, Delete
В бесконечном цикле вводим команды с параметрами:
-c name sex bd
-u id name sex bd
-d id
-i id
-i all
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
-i all - выводит список всех сохранённых пользователей
id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat
Пример параметров: -c Миронов м 15/04/1990
*/
public class Solution_1 {

    private static List<Person> allPeople = new ArrayList<>();

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        while (true) {

            String line = scanner.nextLine();
            if (line.isEmpty()) {
                System.out.println("Не получены данные");
                continue;
            }

            if (line.equals("exit")) return;

            List<String> data = new ArrayList<>();

            StringTokenizer stringTokenizer = new StringTokenizer(line, " ");
            while (stringTokenizer.hasMoreTokens()) {
                data.add(stringTokenizer.nextToken());
            }

            switch (data.get(0)) {
                case "-c":
                    create(data);
                    break;
                case "-i":
                    get(data);
                    break;
            }
        }
    }

    private static void get(List<String> data) {
        System.out.println(allPeople.get(Integer.parseInt(data.get(1))));
    }

    private static void create(List<String> data) {
        validateDataSize(data);
        Person person;
        try {
            person = new Person(data.get(1), getSex(data), getBirthDay(data.get(3)));
        } catch (IllegalArgumentException e) {
            System.out.println("Данные не валидны: " + e.getMessage());
            return;
        }
        allPeople.add(person);
    }

    private static void validateDataSize(List<String> data) {
        if (data.size() != 4) {
            System.out.println(String.format("Данные не валидны, их %s, а надо 4.", data.size()));
        }
    }

    private static LocalDate getBirthDay(String date) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(date, dateFormat);
    }

    private static Sex getSex(List<String> data) {
        if (data.get(2).equals("m")) {
            return Sex.MALE;
        } else if (data.get(2).equals("f")) {
            return Sex.FEMALE;
        } else {
            throw new IllegalArgumentException("Нет такого пола: " + data.get(2));
        }
    }
}
