package ru.otus.java.basic.homeworks.homework7.interfaces.transport;

import ru.otus.java.basic.homeworks.homework7.interfaces.Person;

public interface Relocate {
    boolean move(Person person, int distance, Area area);
}
