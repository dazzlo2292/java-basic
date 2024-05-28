package ru.otus.java.basic.homeworks.homework10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private final Map<String, Set<String>> map;

    public PhoneBook() {
        map = new HashMap<>();
    }

    public void add(String name, String phone) {
        if (name == null && phone == null) {
            return;
        }

        if (map.containsKey(name)) {
            map.get(name).add(phone);
        } else {
            Set<String> phones = new HashSet<>();
            phones.add(phone);
            map.put(name, phones);
        }
    }

    public Set<String> find(String name) {
        return map.get(name);
    }

    public boolean containsPhoneNumber(String phone) {
        for (Set<String> element : map.values()) {
            if (element.contains(phone)) {
                return true;
            }
        }
        return false;
    }
}
