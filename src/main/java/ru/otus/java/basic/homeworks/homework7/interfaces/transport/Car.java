package ru.otus.java.basic.homeworks.homework7.interfaces.transport;

import ru.otus.java.basic.homeworks.homework7.interfaces.Person;

public class Car extends Transport implements Relocate {
    public Car(int resource) {
        super(resource);
    }

    @Override
    public boolean checkArea(Area area) {
        return area == Area.FIELD;
    }

    @Override
    public boolean move(Person person, int distance, Area area) {
        if (person == null) {
            return false;
        }
        if (this.checkArea(area) && getResource() >= distance) {
            System.out.printf("%s drove in a car %d km in %s!%n", person.getName(), distance, area);
            setResource(getResource() - distance);
            return true;
        }
        if (getResource() < distance) {
            System.out.println("There is not fuel...");
            return false;
        }
        System.out.println("The car can't drive on the " + area);
        return false;
    }
}
