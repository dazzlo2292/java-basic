package ru.otus.java.basic.homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите номер операции (1-5):");
        Scanner scanner = new Scanner(System.in);

        int numberOperation = scanner.nextInt();
        if (numberOperation == 1) {
            greetings();
        } else if (numberOperation == 2) {
            int a = (int)(Math.random() * 50);
            int b = (int)(Math.random() * -100);
            int c = (int)(Math.random() * 50);
            checkSign(a,b,c);
        } else if (numberOperation == 3) {
            selectColor();
        } else if (numberOperation == 4) {
            compareNumbers();
        } else if (numberOperation == 5) {
            int initValue = (int)(Math.random() * 10);
            int delta = (int)(Math.random() * 10);
            boolean increment = Math.random() * 2 == 1;
            addOrSubtractAndPrint(initValue,delta,increment);
        } else {
            System.out.println("Unknown operation");
        }
    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = (int)(Math.random() * 30);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else if (data > 20) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
