package ru.otus.java.basic.homeworks.homework5.oop2.animals;

public class Cat extends Animal {
    public Cat(String name, int runSpeed, int stamina) {
        super(name, runSpeed, 0, stamina);
    }

    @Override
    public float swim(int distance) {
        System.out.println("Cat can't swim!");
        return 0;
    }
}
