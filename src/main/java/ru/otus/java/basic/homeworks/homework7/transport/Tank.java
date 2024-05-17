package ru.otus.java.basic.homeworks.homework7.transport;

import ru.otus.java.basic.homeworks.homework7.Person;

public class Tank extends Transport implements Relocate {
    public Tank(int resource) {
        super(resource);
    }

    @Override
    public boolean checkArea(Area area) {
        return true;
    }

    @Override
    public boolean move(Person person, int distance, Area area) {
        if (person == null) {
            return false;
        }
        if (resource >= distance) {
            System.out.printf("%s drove in a tank %d km in %s!\n", person.getName(), distance, area);
            resource -= distance;
            return true;
        }
        System.out.println("There is not fuel...");
        return false;
    }
}
