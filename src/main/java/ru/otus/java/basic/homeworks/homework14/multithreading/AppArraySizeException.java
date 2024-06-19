package ru.otus.java.basic.homeworks.homework14.multithreading;

public class AppArraySizeException extends Exception{
    public AppArraySizeException(int size, int threadsCount) {
        super("Incorrect size of array[" + size + "] or count of threads[" + threadsCount + "]!\n" +
                "Expected — SIZE % THREADS_COUNT == 0");
    }
}
