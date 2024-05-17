package ru.otus.java.basic.homeworks.homework7;

import ru.otus.java.basic.homeworks.homework7.transport.Area;
import ru.otus.java.basic.homeworks.homework7.transport.Relocate;

public class Person{
    private final String name;
    private int stamina;
    private Relocate currentTransport;

    public Person(String name) {
        this.name = name;
        this.stamina = 100;
    }

    public boolean getOn(Relocate transport) {
        if (transport != null && currentTransport == null) {
            currentTransport = transport;
            return true;
        }
        return false;
    }

    public boolean getOff() {
        if (currentTransport != null) {
            currentTransport = null;
            return true;
        }
        return false;
    }

    public boolean move(int distance, Area area) {
        if (currentTransport == null) {
            if (stamina >= distance) {
                System.out.printf("%s is on foot %d km in %s.\n", name, distance, area);
                stamina -= distance;
                return true;
            }
            System.out.printf("%s is tired!\n", name);
            return false;
        }
        return currentTransport.move(this,distance,area);
    }

    public String getName() {
        return name;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}
