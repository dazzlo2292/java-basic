package ru.otus.java.basic.homeworks.homework7.interfaces.transport;

import ru.otus.java.basic.homeworks.homework7.interfaces.Person;

public class Bicycle extends Transport implements Relocate {
    public Bicycle(Person person) {
        super(person.getStamina());
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
        if (this.checkArea(area) && person.getStamina() >= distance) {
            System.out.printf("%s rode a bicycle %d km in %s!%n", person.getName(), distance, area);
            person.setStamina(person.getStamina() - distance);
            return true;
        }
        if (person.getStamina() < distance) {
            System.out.printf("%s is tired!%n", person.getName());
            return false;
        }
        System.out.println("The bicycle can't drive on the " + area);
        return false;
    }
}
