package ru.xpendence.b_oop;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 12.12.19
 * Time: 16:42
 * e-mail: slava_rossii@list.ru
 */

/* Реализовать метод printMainInfo
1. Напиши реализацию метода printMainInfo, чтобы:
1.1. Если в метод передают объект типа Drawable, у этого объекта вызывался метод draw.
1.2. Если в метод передают объект типа Movable, у этого объекта вызывался метод move.
2. Метод main менять нельзя.
*/
public class Solution_3 {

    public static void main(String[] args) {
        Object obj = new Circle();
        Movable movable = (Movable) obj;
        Drawable drawable = new Rectangle();

        printMainInfo(drawable);
        printMainInfo(movable);
    }

    private static void printMainInfo(Object o) {

    }

    static interface Movable {
        void move();
    }

    static class Circle implements Movable {

        public void draw() {
            System.out.println("can be drawn");
        }

        public void move() {
            System.out.println("can be moved");
        }

    }

    static interface Drawable {
        void draw();
    }

    static class Rectangle implements Drawable {
        public void draw() {
            System.out.println("can be drawn");
        }

        public void move() {
            System.out.println("can be moved");
        }
    }
}
