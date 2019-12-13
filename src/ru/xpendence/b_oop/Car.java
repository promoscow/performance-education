package ru.xpendence.b_oop;

import java.util.Objects;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 13.12.19
 * Time: 13:48
 * e-mail: slava_rossii@list.ru
 */

/*
Написать класс Car с полями кузов, руль, двигатель.
Написать все возможные конструкторы и гетеры с сетерами.
Написать методы, которые позволят машине: ездить и сигналить.

В другом классе создать машину и показать, как она ездит и сигналит.
 */
public class Car {

    private String kuzov;
    private String wheel;
    private String engine;

    public Car() {
    }

    public Car(String kuzov) {
        this.kuzov = kuzov;
    }

    public Car(String kuzov, String wheel) {
        this.kuzov = kuzov;
        this.wheel = wheel;
    }

    public Car(String kuzov, String wheel, String engine) {
        this.kuzov = kuzov;
        this.wheel = wheel;
        this.engine = engine;
    }

    public String getKuzov() {
        return kuzov;
    }

    public void setKuzov(String kuzov) {
        this.kuzov = kuzov;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(kuzov, car.kuzov) &&
                Objects.equals(wheel, car.wheel) &&
                Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kuzov, wheel, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "kuzov='" + kuzov + '\'' +
                ", wheel='" + wheel + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
