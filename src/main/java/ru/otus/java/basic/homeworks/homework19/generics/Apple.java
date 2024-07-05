package ru.otus.java.basic.homeworks.homework19.generics;

public class Apple extends Fruit{
    private final float weight;

    public Apple() {
        this.weight = 0.1f;
    }

    @Override
    public float getWeight() {
        return weight;
    }
}
