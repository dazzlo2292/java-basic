package ru.otus.java.basic.homeworks.homework5;

public class Dog extends Animal {
    public Dog(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, swimSpeed, stamina);
    }

    @Override
    public float swim(int distance) {
        float staminaCosts = distance * 2;
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
