package ru.otus.java.basic.homeworks.homework19.generics;

public class MainHomework19 {
    public static void main(String[] args) {
        Box<Orange> oranges = new Box<>(1.0f);
        Box<Apple> apples = new Box<>(1.5f);
        Box<Fruit> fruits = new Box<>(2.0f);

        oranges.addFruit(new Orange());
        oranges.addFruit(new Orange());

        apples.addFruit(new Apple());
        apples.addFruit(new Apple());
        apples.addFruit(new Apple());

        fruits.addFruit(new Orange());
        fruits.addFruit(new Apple());

        System.out.printf("Oranges = %.2f kg.\n", oranges.getCurrentWeight());
        System.out.printf("Apples = %.2f kg.\n", apples.getCurrentWeight());
        System.out.printf("Fruits = %.2f kg.\n", fruits.getCurrentWeight());

        System.out.printf("Apples and Fruits boxes equals — %b\n", apples.compare(fruits));

        apples.relocateFruits(fruits,2);

        System.out.printf("Oranges = %.2f kg.\n", oranges.getCurrentWeight());
        System.out.printf("Apples = %.2f kg.\n", apples.getCurrentWeight());
        System.out.printf("Fruits = %.2f kg.\n", fruits.getCurrentWeight());
    }
}
