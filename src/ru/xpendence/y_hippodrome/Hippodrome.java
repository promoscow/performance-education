package ru.xpendence.y_hippodrome;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 15.12.19
 * Time: 13:03
 * e-mail: slava_rossii@list.ru
 */
public class Hippodrome {

    public static void main(String[] args) {

        List<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Пострел"));
        horses.add(new Horse("Турбо"));
        horses.add(new Horse("Форсаж"));

        HorseRunner runner = new HorseRunner(horses);
        Thread thread = new Thread(runner);
        thread.start();
    }
}
