package com.johu.java.concurrent.compare;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by johu on 17-7-5.
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(new Human("Sarah", 9,211), new Human("Jack1", 10,6),new Human("Jack", 11,211));
        humans.sort(Comparator.comparing(Human::getType));
        humans.subList(1,humans.size()).sort(Comparator.comparing(Human::getAge).reversed());
        System.out.println(1);
    }
}
class Human {
    private String name;
    private int age;
    private int type;

    public Human() {
        super();
    }

    public Human(final String name, final int age,int type) {
        super();

        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    // standard getters and setters
}