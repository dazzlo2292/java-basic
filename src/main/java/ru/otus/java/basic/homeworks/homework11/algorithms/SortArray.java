package ru.otus.java.basic.homeworks.homework11.algorithms;


public class SortArray {
    public static void bubbleSort(int[] array) {
        if (array.length == 0) {
            return;
        }

        int temp;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[i]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] array, int left, int right) {
        if (array.length == 0 || left >= right) {
            return;
        }

        int middleIndex = (left + right) / 2;
        int middleElement = array[middleIndex];
        int i = left;
        int j = right;

        while (i <= j) {
            while (array[i] < middleElement) {
                i++;
            }
            while (array[j] > middleElement) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (left < j) {
            quickSort(array, left, j);
        }
        if (i < right) {
            quickSort(array, i, right);
        }
    }
}
