package ru.otus.java.basic.homeworks.homework11;

import java.util.HashMap;
import java.util.Map;

public class PersonDataBase {
    private final Map<Long, Person> persons = new HashMap<>();

    public Person findById(Long id) {
        return persons.get(id);
    }

    public void add(Person person) {
        persons.put(person.getId(), person);
    }

    public boolean isManager(Person person) {
        Position position = findById(person.getId()).getPosition();
        return position.isManager();
    }

    public boolean isEmployee(Long id) {
        Position position = findById(id).getPosition();
        return !position.isManager();
    }
}
