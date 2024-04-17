package ru.otus.java.basic.homework2;

import java.util.Arrays;

public class MainHomework2 {
    public static void main(String[] args) {
//        printAmountStrings("Hello otus", 5);
//        sumArrayElements(new int[] {1,2,3,4,5,6,7,8,9});
//        replaceElements(new int[] {5,4,3,2,1}, 0);
//        incrementElements(new int[] {5,4,3,2,1}, 3);
//        printBiggerSumOfHalf(new int[] {1,2,3,3,2,1});

        /***** hard *****/

//        createArrayFromSum(new int[] {9,6,3,5,1}, new int[] {3,2,1}, new int[] {1,2,3,4});
//        findEqualsPoint(new int[] {3,4,1,4,4});
//        checkIncrease(new int[] {1,1,2,3,5,8,13});
//        reverseArray(new int[] {1,1,2,3,5,8,13});
    }

    public static void printAmountStrings(String text, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println(text);
        }
    }

    public static void sumBigElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    public static void replaceElements(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void incrementElements(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            array[i] += number;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void printBiggerSumOfHalf(int[] array) {
        int sumLeftHalf = 0;
        int sumRightHalf = 0;

        for (int i = 0; i < array.length / 2; i++) {
            sumLeftHalf += array[i];
        }
        for (int i = array.length / 2; i < array.length; i++) {
            sumRightHalf += array[i];
        }

        if (sumLeftHalf > sumRightHalf) {
            System.out.println("Сумма элементов левой половины массива больше!");
        } else if (sumLeftHalf < sumRightHalf) {
            System.out.println("Сумма элементов правой половины массива больше!");
        } else {
            System.out.println("Суммы элементов левой и правой половин массива равны!");
        }
     }

    /***** hard *****/

    public static void createArrayFromSum(int[]... arrays) {
        int maxElements = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].length > maxElements) {
                maxElements = arrays[i].length;
            }
        }

        int[] resultArray = new int[maxElements];

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                resultArray[j] += arrays[i][j];
            }
        }

        System.out.println(Arrays.toString(resultArray));
    }

    public static void findEqualsPoint(int[] array) {
        boolean isFind = false;
        int sumAllElements = 0;
        int sumLeftElements = 0;
        int sumRightElements = 0;

        for (int i = 0; i < array.length; i++) {
            sumAllElements += array[i];
        }

        if (sumAllElements % 2 == 0) {
            sumLeftElements = sumAllElements;
            for (int i = array.length - 1; i > 0; i--) {
                sumLeftElements -= array[i];
                sumRightElements += array[i];
                if (sumLeftElements == sumRightElements) {
                    isFind = true;
                }
            }
        }

        if (isFind) {
            System.out.println("Точка найдена!");
        } else {
            System.out.println("Точка не найдена.");
        }

        /*boolean isFind = false;

        for (int i = 0; i < array.length; i++) {
            int sumLeftElements = 0;
            int sumRightElements = 0;

            for (int j = 0; j <= i; j++) {
                sumLeftElements += array[j];
            }
            for (int k = i + 1; k < array.length; k++) {
                sumRightElements += array[k];
            }

            if (sumLeftElements == sumRightElements) {
                isFind = true;
                break;
            }
        }

        if (isFind) {
            System.out.println("Точка найдена!");
        } else {
            System.out.println("Точка не найдена.");
        }*/
    }

    public static void checkIncrease(int[] array) {
        boolean isIncrease = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isIncrease = false;
                break;
            }
        }

        System.out.println("Все элементы массива расположены в порядке возрастания: " + isIncrease);
    }

    public static void reverseArray(int[] array) {
        int temp;

        for (int i = 0; i < array.length / 2; i++) {
            int rightIndex = (array.length - 1) - i;

            temp = array[i];
            array[i] = array[rightIndex];
            array[rightIndex] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
