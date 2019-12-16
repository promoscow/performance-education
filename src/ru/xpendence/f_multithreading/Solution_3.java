package ru.xpendence.f_multithreading;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 15.12.19
 * Time: 12:50
 * e-mail: slava_rossii@list.ru
 */

/* Список и нити
В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
*/
public class Solution_3 {

    public static volatile List<Thread> list = new ArrayList<>(5);

    public static void main(String[] args) {
        SpecialThread thread = new SpecialThread();

        Thread thread1 = new Thread(thread);
        list.add(thread1);
        Thread thread2 = new Thread(thread);
        list.add(thread2);
        Thread thread3 = new Thread(thread);
        list.add(thread3);
        Thread thread4 = new Thread(thread);
        list.add(thread4);
        Thread thread5 = new Thread(thread);
        list.add(thread5);

        list.forEach(Thread::start);

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's run method inside SpecialThread");
        }
    }
}
