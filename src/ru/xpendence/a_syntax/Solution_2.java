package ru.xpendence.a_syntax;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 12.12.19
 * Time: 14:39
 * e-mail: slava_rossii@list.ru
 */

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution_2 {

    public static void main(String[] args) {

        double course = 1.1;

        System.out.println(convertEurToUsd(100, course));
        System.out.println(convertEurToUsd(200, course));
    }

    private static double convertEurToUsd(int e, double exchange) {
        return e * exchange;
    }
}
