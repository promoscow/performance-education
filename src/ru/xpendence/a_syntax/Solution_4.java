package ru.xpendence.a_syntax;

import java.util.Scanner;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 12.12.19
 * Time: 14:54
 * e-mail: slava_rossii@list.ru
 */

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/
public class Solution_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        printMin(a, b);
    }

    private static void printMin(int a, int b) {
        System.out.println(a < b ? a : b);
    }
}
