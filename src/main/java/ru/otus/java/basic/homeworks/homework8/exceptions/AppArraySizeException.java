package ru.otus.java.basic.homeworks.homework8.exceptions;

public class AppArraySizeException extends Exception{
    public AppArraySizeException(int size) {
        super("Incorrect size of array! Expected array size — " + "[" + size + "]" + "[" + size + "]");
    }
}
