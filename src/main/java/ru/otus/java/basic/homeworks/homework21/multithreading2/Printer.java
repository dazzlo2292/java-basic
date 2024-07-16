package ru.otus.java.basic.homeworks.homework21.multithreading2;

public class Printer {
    private final Object monitor = new Object();
    private char lastChar;

    public void printChar(char current, char last) {
        synchronized (monitor) {
            for (int i = 0; i < 5; i++) {
                while (lastChar != last && lastChar != 0) {
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(current);
                lastChar = current;
                monitor.notifyAll();
            }
        }
    }
}
