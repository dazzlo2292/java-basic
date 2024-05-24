package ru.otus.java.basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.List;

public class MainHomework9 {
    public static void main(String[] args) {
        List<Integer> list = ListOperations.createIncrementList(-5,10);
        System.out.println(list);

        System.out.println(ListOperations.sumElementsMoreThan5(list));

        ListOperations.replaceAllElements(0, list);
        System.out.println(list);

        ListOperations.increaseElements(7, list);
        System.out.println(list);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Nick", 32));
        employees.add(new Employee("John", 56));
        employees.add(new Employee("Anna", 29));

        System.out.println(ListOperations.getNames(employees));

        System.out.println(ListOperations.getOldEmployees(employees, 40));

        System.out.println(ListOperations.checkAvgAge(employees, 40));

        System.out.println(ListOperations.searchYoung(employees));
    }
}
