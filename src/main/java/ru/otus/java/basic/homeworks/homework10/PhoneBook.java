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

    public void add(String name, String address) {
        if (name == null && address == null) {
            return;
        }

        if (map.containsKey(name)) {
            map.get(name).add(address);
        } else {
            Set<String> addresses = new HashSet<>();
            addresses.add(address);
            map.put(name, addresses);
        }
    }

    public Set<String> find(String name) {
        return map.get(name);
    }

    public boolean containsPhoneNumber(String address) {
        for (Set<String> element : map.values()) {
            if (element.contains(address)) {
                return true;
            }
        }
        return false;
    }
}
