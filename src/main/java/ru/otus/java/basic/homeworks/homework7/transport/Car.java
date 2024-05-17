package ru.otus.java.basic.homeworks.homework7.transport;

import ru.otus.java.basic.homeworks.homework7.Person;

public class Car extends Transport implements Relocate {
    public Car(int resource) {
        super(resource);
    }

    @Override
    public boolean checkArea(Area area) {
        if (area == Area.WOOD || area == Area.SWAMP) {
            return false;
        }
        return true;
    }

    @Override
    public boolean move(Person person, int distance, Area area) {
        if (person == null) {
            return false;
        }
        if (this.checkArea(area) && resource >= distance) {
            System.out.printf("%s drove in a car %d km in %s!\n", person.getName(), distance, area);
            resource -= distance;
            return true;
        }
        if (resource < distance) {
            System.out.println("There is not fuel...");
            return false;
        }
        System.out.println("The car can't drive on the " + area);
        return false;
    }
}
