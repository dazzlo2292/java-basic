package ru.otus.java.basic.homeworks.homework10.collections;


public class MainHomework10 {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.add("John","79998887766");
        book.add("Nick","79998887755");
        book.add("Anna","79998887744");
        book.add("Anna","79998887700");

        System.out.println(book.containsPhoneNumber("79998887755"));

        System.out.println(book.find("Anna"));
    }
}
