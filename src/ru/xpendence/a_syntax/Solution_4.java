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

        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();
        }

        int i = printMin(a);
        System.out.println(i);
    }

    private static int printMin(int[] a) {
        int min = a[0];
        for (int i = 1; i < 5; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
}
