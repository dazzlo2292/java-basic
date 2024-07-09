package ru.otus.java.basic.homeworks.homework7.interfaces.transport;

import ru.otus.java.basic.homeworks.homework7.interfaces.Person;

public class Horse extends Transport implements Relocate {
    public Horse(int resource) {
        super(resource);
    }

    @Override
    public boolean checkArea(Area area) {
        return area == Area.FIELD || area == Area.WOOD;
    }

    @Override
    public boolean move(Person person, int distance, Area area) {
        if (person == null) {
            return false;
        }
        if (this.checkArea(area) && getResource() >= distance) {
            System.out.printf("%s rode a horse %d km in %s!%n", person.getName(), distance, area);
            setResource(getResource() - distance);
            return true;
        }
        if (getResource() < distance) {
            System.out.println("The horse is tired!");
            return false;
        }
        System.out.println("The horse can't run on the " + area);
        return false;
    }
}
