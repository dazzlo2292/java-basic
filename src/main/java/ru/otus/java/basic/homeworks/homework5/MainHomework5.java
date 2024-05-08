package ru.otus.java.basic.homeworks.homework5;

import ru.otus.java.basic.homeworks.homework5.animals.Cat;
import ru.otus.java.basic.homeworks.homework5.animals.Dog;
import ru.otus.java.basic.homeworks.homework5.animals.Horse;

public class MainHomework5 {
    public static void main(String[] args) {
        Cat cat = new Cat("Persey", 2, 20);
        Dog dog = new Dog("Rex", 5, 3, 50);
        Horse horse = new Horse("Bullet", 10, 2, 100);

        cat.info();
        dog.info();
        horse.info();

        System.out.printf("Result: %.2f (s)\n\n", cat.run(15));
        System.out.printf("Result: %.2f (s)\n\n", cat.swim(5));
        System.out.printf("Result: %.2f (s)\n\n", dog.swim(30));
        System.out.printf("Result: %.2f (s)\n\n", horse.run(60));
        System.out.printf("Result: %.2f (s)\n\n", horse.swim(10));

        cat.info();
        dog.info();
        horse.info();
    }
}
