package ru.otus.java.basic.homeworks.homework21.multithreading2;

public class Printer {
    private final Object monitor = new Object();
    private char lastChar;

    public void printA() {
        synchronized (monitor) {
            for (int i = 0; i < 5; i++) {
                while (lastChar != 'C' && lastChar != 0) {
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print('A');
                lastChar = 'A';
                monitor.notifyAll();
            }
        }
    }

    public void printB() {
        synchronized (monitor) {
            for (int i = 0; i < 5; i++) {
                while (lastChar != 'A') {
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print('B');
                lastChar = 'B';
                monitor.notifyAll();
            }
        }
    }

    public void printC() {
        synchronized (monitor) {
            for (int i = 0; i < 5; i++) {
                while (lastChar != 'B') {
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print('C');
                lastChar = 'C';
                monitor.notifyAll();
            }
        }
    }
}
