package ru.otus.java.basic.homeworks.homework7.transport;

public enum Area {
    WOOD("Густой лес"),
    FIELD("Поле"),
    SWAMP("Болото");

    private String description;

    Area(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
