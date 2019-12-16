package ru.xpendence.y_hippodrome;

import java.util.List;
import java.util.Random;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 15.12.19
 * Time: 13:07
 * e-mail: slava_rossii@list.ru
 */
public class HorseRunner implements Runnable {

    private List<Horse> horses;

    HorseRunner(List<Horse> horses) {
        this.horses = horses;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (!move()) return;
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean move() {
        int hippodromeWidth = 120;
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        for (Horse horse : horses) {
            horse.setPosition(setPosition(horse.getPosition()));
            System.out.println(String.valueOf(renderTrack(horse, hippodromeWidth)));
            if ((int) horse.getPosition() == hippodromeWidth) {
                System.out.println(String.format("\n\n\n%s на финише!!", horse.getName()));
                return false;
            }
        }
        return true;
    }

    private char[] renderTrack(Horse horse, int hippodromeWidth) {

        char[] array = new char[hippodromeWidth + 1];
        int position = (int) horse.getPosition();

        array[0] = '|';
        for (int i = 1; i < position; i++) {
            array[i] = ' ';
        }
        array[(int) horse.getPosition()] = '>';
        for (int i = position + 1; i < hippodromeWidth - 2; i++) {
            array[i] = ' ';
        }
        if (position != hippodromeWidth - 2) {
            array[hippodromeWidth - 2] = ':';
        }
        array[hippodromeWidth - 1] = '|';
        return array;


//        StringBuilder builder = new StringBuilder();
//        builder.append("|");
//        int position = (int) horse.getPosition();
//        for (int i = 1; i < position; i++) {
//            builder.append(" ");
//        }
//        builder.append(">");
//        for (int i = position + 1; i < hippodromeWidth; i++) {
//            builder.append(" ");
//        }
//        if ((int) horse.getPosition() != hippodromeWidth) {
//            builder.append(":");
//        }
//        builder.append("|");
//        return builder.toString();
    }

    private double setPosition(double position) {
        double step = new Random().nextDouble();
        return position + step;
    }
}
