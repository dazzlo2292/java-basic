package ru.otus.java.basic.homeworks.homework8.exceptions;

public class Operations {
    public static int sumArrayElements(String[][] array) throws AppArraySizeException, AppArrayDataException {
        final int correctArraySize = 4;
        int sum = 0;

        if (array.length != correctArraySize) {
            throw new AppArraySizeException(correctArraySize);
        }
        for (String[] s : array) {
            if (s.length != correctArraySize) {
                throw new AppArraySizeException(correctArraySize);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new AppArrayDataException(i, j);
                }
            }
        }

        return sum;
    }
}
