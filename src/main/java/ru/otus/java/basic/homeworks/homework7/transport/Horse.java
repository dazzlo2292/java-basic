package ru.otus.java.basic.homeworks.homework7.transport;

import ru.otus.java.basic.homeworks.homework7.Person;

public class Horse extends Transport implements Relocate {
    public Horse(int resource) {
        super(resource);
    }

    @Override
    public boolean checkArea(Area area) {
        if (area == Area.SWAMP) {
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
            System.out.printf("%s rode a horse %d km in %s!\n", person.getName(), distance, area);
            resource -= distance;
            return true;
        }
        if (resource < distance) {
            System.out.println("The horse is tired!");
            return false;
        }
        System.out.println("The horse can't run on the " + area);
        return false;
    }
}
