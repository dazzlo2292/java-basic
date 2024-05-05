package ru.otus.java.basic.homeworks.homework4;

public class User {
    private String surname;
    private String name;
    private String fatherName;
    private int yearOfBirth;
    private String email;

    public User(String surname, String name, String fatherName, int yearOfBirth, String email) {
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    public void printInfo() {
        System.out.printf("ФИО: %s %s %s\n", surname, name, fatherName);
        System.out.printf("Год рождения: %d\n", yearOfBirth);
        System.out.printf("e-mail: %s\n", email);
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
