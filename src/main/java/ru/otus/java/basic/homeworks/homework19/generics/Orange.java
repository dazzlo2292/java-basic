package ru.otus.java.basic.homeworks.homework19.generics;

public class Orange extends Fruit{
    private final float weight;

    public Orange() {
        this.weight = 0.2f;
    }

    @Override
    public float getWeight() {
        return weight;
    }
}
