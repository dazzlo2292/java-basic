package ru.otus.java.basic.homeworks.homework21.multithreading2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainHomework21 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Printer printer = new Printer();

        executorService.execute(() -> {
            printer.printA();
        });

        executorService.execute(() -> {
            printer.printB();
        });

        executorService.execute(() -> {
            printer.printC();
        });

        executorService.shutdown();
    }
}
