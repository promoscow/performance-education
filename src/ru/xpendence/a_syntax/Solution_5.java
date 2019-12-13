package ru.xpendence.a_syntax;

import java.util.Scanner;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 12.12.19
 * Time: 15:07
 * e-mail: slava_rossii@list.ru
 */

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма».
Вывести на экран полученную сумму.
*/
public class Solution_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (true) {
            String s = scanner.nextLine();
            if ("сумма".equals(s)) {
                System.out.println(sum);
                break;
            }
            sum += Integer.parseInt(s);
        }

    }
}
