package ru.otus.java.basic.homeworks.homework6.animals;

import ru.otus.java.basic.homeworks.homework6.containers.Plate;

public class Cat {
    String name;
    int appetite;
    boolean hungry;

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return hungry;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    public void eat(Plate plate) {
        if (plate.takeFood(appetite)) {
            this.hungry = false;
            System.out.println(name + " has eaten!");
        } else {
            System.out.println("There's not enough food on the plate for " + name + "...");
        }
    }
}
