package ru.otus.java.basic.homeworks.homework11.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonDataBase {
    private final Map<Long, Person> persons = new HashMap<>();
    private final Set<Person> managers = new HashSet<>();

    public Person findById(Long id) {
        return persons.get(id);
    }

    public void add(Person person) {
        persons.put(person.getId(), person);
        if (person.getPosition().isManager()) {
            managers.add(person);
        }
    }

    public boolean isManager(Person person) {
        return managers.contains(person);
    }

    public boolean isEmployee(Long id) {
        Person person = findById(id);
        return !managers.contains(person);
    }
}
