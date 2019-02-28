package com.org.programming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicatesInArray {

    public static void main(String[] args) {
        String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };

        // First soultion for brute force O(n^2) time complexity
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println("Duplicate found " + names[j]);
                }
            }
        }

        // Second solution using HashSet

        Set<String> store = new HashSet<>();
        for (String name : names) {
            if (!store.add(name)) {
                System.out.println("Duplicate found" + name);
            }
        }

        // Third solution using hashmap
        Map<String, Integer> nameAndCount = new HashMap<>();
        for (String name : names) {
            Integer count = nameAndCount.get(name);
            if (count == null) {
                nameAndCount.put(name, 1);
            } else {
                nameAndCount.put(name, ++count);
            }
        }
        for (Entry<String, Integer> entry : nameAndCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getValue() - 1 + " Duplicate value found for name " + entry.getKey());
            }
        }

    }
}
