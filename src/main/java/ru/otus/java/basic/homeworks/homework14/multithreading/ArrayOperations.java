package ru.otus.java.basic.homeworks.homework14.multithreading;

import java.util.ArrayList;
import java.util.List;

public class ArrayOperations {
    public static double[] create(int size) throws InterruptedException {
        double[] array = new double[size];
        final int THREADS_COUNT = 4;
        List<ThreadFillArray> threads = new ArrayList<>();

        if ((array.length % THREADS_COUNT) != 0) {
            return null;
        }
        int step = array.length / THREADS_COUNT;

        int currentIndexFrom = 0;
        int currentIndexTo = step - 1;

        for (int i = 0; i < THREADS_COUNT; i++) {
            ThreadFillArray thread = new ThreadFillArray(array, currentIndexFrom, currentIndexTo);
            thread.start();
            threads.add(thread);
            currentIndexFrom += step;
            currentIndexTo += step;
        }

        for (ThreadFillArray thread : threads) {
            thread.join();
        }

        return array;
    }
}
