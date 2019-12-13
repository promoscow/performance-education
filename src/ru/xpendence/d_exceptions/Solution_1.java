package ru.xpendence.d_exceptions;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 13.12.19
 * Time: 16:55
 * e-mail: slava_rossii@list.ru
 */

/*
Создать коллекцию для исключений (Map).
Положить в неё 10 любых исключений.
 */
public class Solution_1 {

    public static void main(String[] args) {

        String s = "hello";
        String s2 = "hello";
        String s1 = s + "!";
        s2 = s2 + "2938745";

        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
