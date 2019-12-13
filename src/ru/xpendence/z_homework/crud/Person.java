package ru.xpendence.z_homework.crud;

import java.util.Date;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 12.12.19
 * Time: 16:52
 * e-mail: slava_rossii@list.ru
 */
public class Person {

    private String name;
    private Sex sex;
    private Date birthDay;

    public Person(String name, Sex sex, Date birthDay) {
        this.name = name;
        this.sex = sex;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", birthDay=" + birthDay +
                '}';
    }
}
