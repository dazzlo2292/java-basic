package ru.otus.java.basic.homeworks.homework3.basics3;

public class MainHomework3 {
    public static void main(String[] args) {
//        System.out.println( sumOfPositiveElements(new int[][] {{1, 1, 2, 3, 5}, {8, 13, 21, -34}}) );
//        printSquareOfStars(7);
        replaceDiagonalElements(new int[][] {{1,1,2},{3,5,8},{13,21,34}});
//        System.out.println( findMax(new int[][] {{1, 1, 2, 3, 5}, {8, 13, 21, -34}}) );
//        System.out.println( sumRow(new int[][] {{1,1,2},{3,5,8},{13,21,34}},2) );
    }

    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    public static void printSquareOfStars(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void replaceDiagonalElements(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) {
                System.out.println("Двумерный массив не квадратный!");
                return;
            }
        }

        for (int i = 0; i < array.length; i++) {
            array[i][i] = 0;
            array[(array.length - 1) - i][i] = 0;
        }

/*        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || i + j == array.length - 1) {
                    array[i][j] = 0;
                }
            }
        }*/

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }

    public static int findMax(int[][] array) {
        int max = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int sumRow(int[][] array, int row) {
        int rowNumber = row - 1;
        if (array.length <= rowNumber) {
            return -1;
        }

        int sum = 0;
        for (int j = 0; j < array[rowNumber].length; j++) {
            sum += array[rowNumber][j];
        }
        return sum;
    }
}
