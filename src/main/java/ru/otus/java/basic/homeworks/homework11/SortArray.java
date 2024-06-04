package ru.otus.java.basic.homeworks.homework11;


public class SortArray {
    public static void bubbleSort(int[] array) {
        if (array.length == 0) {
            return;
        }

        boolean needSort;
        int temp;
        do {
            needSort = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    needSort = true;
                }
            }
        } while (needSort);
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
