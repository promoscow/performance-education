package ru.xpendence.z_homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 12.12.19
 * Time: 15:20
 * e-mail: slava_rossii@list.ru
 */

/* Задача по алгоритмам
Написать метод, который возвращает минимальное число в массиве и его позицию (индекс).
*/
public class Solution_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = getArray(scanner);

        if (list.isEmpty()) {
            System.out.println("Список не содержит элементов.");
            return;
        }
        Collections.sort(list);
        System.out.println(list.get(0));

    }

    private static List<Integer> getArray(Scanner scanner) {
        List<Integer> list = new ArrayList<>();

        while (true) {
            String s = scanner.nextLine();
            if (s.equals("итог")) {
                return list;
            }
            try {
                list.add(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
}
