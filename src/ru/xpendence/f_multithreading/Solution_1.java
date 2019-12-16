package ru.xpendence.f_multithreading;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 12.12.19
 * Time: 16:45
 * e-mail: slava_rossii@list.ru
 */

/* My first thread
Создать public static class TestThread - нить с помощью интерфейса Runnable.
TestThread должен выводить в консоль "My first thread".
*/
public class Solution_1 {

    public static void main(String[] args) {

        TestThread testThread = new TestThread();
        Thread thread = new Thread(testThread);
        thread.start();
    }

    public static class TestThread implements Runnable {

        @Override
        public void run() {
            System.out.println("test thread");
        }
    }
}
