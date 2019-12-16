package ru.xpendence.y_hippodrome;

import java.util.Random;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 15.12.19
 * Time: 13:02
 * e-mail: slava_rossii@list.ru
 */
public class Horse {

    private String name;
    private double speed;
    private double position;

    {
        this.position = 0;
    }

    public Horse(String name) {
        this.name = name;
        this.speed = setSpeed();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    double getPosition() {
        return position;
    }

    void setPosition(double position) {
        this.position = position;
    }

    private double setSpeed() {
        double speed = new Random().nextDouble();
        return 0.5 + speed;
    }
}
