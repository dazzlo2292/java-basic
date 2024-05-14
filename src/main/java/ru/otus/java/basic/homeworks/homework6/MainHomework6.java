package ru.otus.java.basic.homeworks.homework6;

import ru.otus.java.basic.homeworks.homework6.animals.Cat;
import ru.otus.java.basic.homeworks.homework6.containers.Plate;

import java.util.ArrayList;
import java.util.List;

public class MainHomework6 {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        List<Cat> cats =  new ArrayList<>();
        cats.add(new Cat("Persey",30));
        cats.add(new Cat("Busya",50));
        cats.add(new Cat("Olaf",70));

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        System.out.println();
        for (Cat cat : cats) {
            System.out.printf("Is %s hungry — %b\n", cat.getName(), cat.isHungry());
        }
    }
}
