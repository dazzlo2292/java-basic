package ru.otus.java.basic.homeworks.homework7.transport;

import ru.otus.java.basic.homeworks.homework7.Person;

public interface Relocate {
    public boolean move(Person person, int distance, Area area);
}
