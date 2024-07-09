package ru.otus.java.basic.homeworks.homework5.oop2.animals;

public class Horse extends Animal {
    public Horse(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, swimSpeed, stamina);
    }

    @Override
    public float swim(int distance) {
        if (isTired) {
            System.out.println(name + " is tired.");
            return -1;
        }

        float staminaCosts = distance * 4;
        System.out.println(name + " started to swim...");
        if (staminaCosts <= stamina) {
            stamina -= staminaCosts;
            System.out.println("..." + name + " finished!");
            return distance / runSpeed;
        } else {
            System.out.println("..." + name + " is tired.");
            stamina = 0;
            isTired = true;
            return -1;
        }
    }
}
