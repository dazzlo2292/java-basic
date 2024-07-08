package ru.otus.java.basic.homeworks.homework19.generics;

import ru.otus.java.basic.homeworks.homework19.generics.fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final float maxWeight;
    private float currentWeight;
    private final List<T> fruits;

    public Box(float maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0.0f;
        this.fruits =  new ArrayList<>();
    }

    public float getCurrentWeight() {
        return currentWeight;
    }

    public float getMaxWeight() {
        return maxWeight;
    }

    public boolean addFruit(T fruit) {
        if (maxWeight - currentWeight < fruit.getWeight()) {
            System.out.println("The box is full");
            return false;
        }
        fruits.add(fruit);
        currentWeight += fruit.getWeight();
        return true;
    }

    public boolean compare(Box<?> box) {
        return Math.abs(this.getCurrentWeight() - box.getCurrentWeight()) < 0.01;
    }

    public void relocateFruits(Box<? super T> targetBox, int count) {
        int counter = 0;
        for (int i = 0; i < count; i++) {
            if (fruits.isEmpty()) {
                System.out.printf("Relocated %d fruits. Current box is empty.\n", counter);
                return;
            }
            if (targetBox.getCurrentWeight() + fruits.get(0).getWeight() < targetBox.getMaxWeight()) {
                targetBox.addFruit(fruits.get(0));
                currentWeight -= fruits.get(0).getWeight();
                fruits.remove(0);
                counter++;
            } else {
                System.out.printf("Relocated %d fruits. Target box is full.\n", counter);
                return;
            }
        }
        System.out.printf("Relocated %d fruits.\n", counter);
    }
}
