package ru.otus.java.basic.homeworks.homework14.multithreading;


public class MainHomework14 {
    public static void main(String[] args) {
        final int SIZE  = 100_000_000;
        long startTime = System.currentTimeMillis();

        try {
            ArrayOperations.create(SIZE);
            long stopTime = System.currentTimeMillis();
            System.out.println("Filling with multithreading = " + (stopTime - startTime));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
