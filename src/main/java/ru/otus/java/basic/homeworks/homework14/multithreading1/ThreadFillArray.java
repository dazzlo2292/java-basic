package ru.otus.java.basic.homeworks.homework14.multithreading1;

public class ThreadFillArray extends Thread{
    private final double[] array;
    private final int indexFrom;
    private final int indexTo;

    public ThreadFillArray(double[] array, int indexFrom, int indexTo) {
        this.array = array;
        this.indexFrom = indexFrom;
        this.indexTo = indexTo;
    }

    @Override
    public void run() {
        for (int i = indexFrom; i <= indexTo; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }
}
