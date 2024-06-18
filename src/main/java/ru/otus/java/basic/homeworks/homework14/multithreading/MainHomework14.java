package ru.otus.java.basic.homeworks.homework14.multithreading;


public class MainHomework14 {
    public static void main(String[] args) {
        final int SIZE  = 100_000_000;
        long startTime = System.currentTimeMillis();

        try {
            ArrayOperations.create(SIZE);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        long stopTime = System.currentTimeMillis();
        System.out.println("Filling with multithreading = " + (stopTime - startTime));
    }
}
