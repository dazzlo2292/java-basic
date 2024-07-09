package ru.otus.java.basic.homeworks.homework7.interfaces;

import ru.otus.java.basic.homeworks.homework7.interfaces.transport.*;

public class MainHomework7 {
    public static void main(String[] args) {
        Person person = new Person("Nick");
        person.move(20, Area.WOOD);

        Relocate bicycle = new Bicycle(person);
        Relocate horse = new Horse(100);
        Relocate tank = new Tank(1000);

        person.getOn(bicycle);
        person.move(50, Area.FIELD);

        person.getOff();
        person.getOn(horse);
        person.move(10, Area.SWAMP);

        person.getOff();
        person.getOn(tank);
        person.move(10, Area.SWAMP);

        person.getOff();
        person.move(25,Area.FIELD);
        person.move(10,Area.SWAMP);
    }
}
