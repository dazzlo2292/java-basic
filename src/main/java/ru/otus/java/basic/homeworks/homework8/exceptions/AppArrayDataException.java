package ru.otus.java.basic.homeworks.homework8.exceptions;

public class AppArrayDataException extends RuntimeException{
    public AppArrayDataException(int i, int j) {
        super("Incorrect data in element with indexes " + "[" + i + "]" + "[" + j + "]");
    }
}
