package ru.otus.java.basic.homeworks.homework21.multithreading2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainHomework21 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Printer printer = new Printer();

        executorService.execute(() -> {
            printer.printChar('A','C');
        });

        executorService.execute(() -> {
            printer.printChar('B','A');
        });

        executorService.execute(() -> {
            printer.printChar('C','B');
        });

        executorService.shutdown();
    }
}
