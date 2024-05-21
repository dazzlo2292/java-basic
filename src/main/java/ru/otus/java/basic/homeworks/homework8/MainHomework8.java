package ru.otus.java.basic.homeworks.homework8;

import ru.otus.java.basic.homeworks.homework8.exceptions.AppArrayDataException;
import ru.otus.java.basic.homeworks.homework8.exceptions.AppArraySizeException;

public class MainHomework8 {
    public static void main(String[] args) {
        String[][] array = new String[][] {
                {"0","1","1","2"},
                {"3","5","8","13"},
                {"21","34","55","89"},
                {"144","233","377","610"}
        };

        try {
            System.out.println(Operations.sumArrayElements(array));
        }
        catch (AppArraySizeException | AppArrayDataException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
