package ru.otus.java.basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    public static List<Integer> createIncrementList(int min, int max) {
        List<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            list.add(i);
        }
        return list;
    }

    public static int sumElementsMoreThan5(List<Integer> list) {
        if (list == null) {
            return 0;
        }

        int sum = 0;
        for (Integer element : list) {
            if (element > 5) {
                sum += element;
            }
        }
        return sum;
    }

    public static void replaceAllElements(int number, List<Integer> list) {
        if (list == null) {
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
    }

    public static void increaseElements(int number, List<Integer> list) {
        if (list == null) {
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + number);
        }
    }

    public static List<String> getNames(List<Employee> list) {
        if (list == null) {
            return null;
        }

        List<String> names = new ArrayList<>(list.size());
        for (Employee employee : list) {
            names.add(employee.getName());
        }
        return names;
    }

    public static List<Employee> getOldEmployees(List<Employee> list, int minAge) {
        if (list == null) {
            return null;
        }

        List<Employee> oldEmployees = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.getAge() >= minAge) {
                oldEmployees.add(employee);
            }
        }
        return oldEmployees;
    }

    public static boolean checkAvgAge(List<Employee> list, int minAvgAge) {
        if (list == null) {
            return false;
        }

        float sumAges = 0;
        for (Employee employee : list) {
            sumAges += employee.getAge();
        }
        float avgAge = sumAges / list.size();
        return avgAge > minAvgAge;
    }

    public static Employee searchYoung(List<Employee> list) {
        if (list == null) {
            return null;
        }

        Employee young = list.get(0);
        for (Employee employee : list) {
            if (employee.getAge() < young.getAge()) {
                young = employee;
            }
        }
        return young;
    }
 }
