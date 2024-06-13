package ru.otus.java.basic.homeworks.homework11;

public enum Position {
    MANAGER(true),
    DIRECTOR(true),
    DRIVER(false),
    ENGINEER(false),
    SENIOR_MANAGER(true),
    DEVELOPER(false),
    QA(false),
    JANITOR(false),
    PLUMBER(false),
    BRANCH_DIRECTOR(true),
    JUNIOR_DEVELOPER(false);

    private final boolean manager;

    Position(boolean manager) {
        this.manager = manager;
    }

    public boolean isManager() {
        return manager;
    }
}
