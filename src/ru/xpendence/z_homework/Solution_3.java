package ru.xpendence.z_homework;

import java.io.*;
import java.util.Scanner;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 12.12.19
 * Time: 15:23
 * e-mail: slava_rossii@list.ru
 */

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/
public class Solution_3 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new FileReader(scanner.nextLine()));

        reader.lines()
                .map(Integer::parseInt)
                .filter(e -> e % 2 == 0)
                .sorted().forEach(System.out::println);

        reader.close();
    }
}
