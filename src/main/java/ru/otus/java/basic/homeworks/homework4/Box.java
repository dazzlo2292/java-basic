package ru.otus.java.basic.homeworks.homework4;

public class Box {
    final private int size;
    private String color;
    private boolean isOpen;
    private boolean isEmpty;
    private String item;

    public Box(int size, String color) {
        this.size = size;
        this.color = color;
        this.isOpen = false;
        this.isEmpty = true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Box color changed on " + color);
        System.out.println();
    }

    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("The box is open\n");
        } else {
            System.out.println("Box already open\n");
        }
    }

    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("The box is closed\n");
        } else {
            System.out.println("Box already closed\n");
        }
    }

    public boolean isOpen() {
        return isOpen;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void putItem(String item) {
        if (isEmpty && isOpen) {
            this.item = item;
            isEmpty = false;
            System.out.println("Put " + item + " in the box\n");
        } else {
            System.out.println("Box is not empty or closed!\n");
        }
    }

    public String getItem() {
        if (!isEmpty && isOpen) {
            String tempItem = item;
            item = null;
            isEmpty = true;
            return tempItem;
        } else {
            System.out.println("Box is empty or closed!\n");
            return null;
        }
    }

    public void printInfo() {
        System.out.println("Size (sm): " + size);
        System.out.println("Color: " + color);
        System.out.println("Is open: " + isOpen);
        System.out.println("Item: " + item);
        System.out.println("Is empty: " + isEmpty);
        System.out.println();
    }
}
