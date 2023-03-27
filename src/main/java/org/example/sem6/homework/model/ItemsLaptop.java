package org.example.sem6.homework.model;

import java.util.HashSet;
import java.util.Set;

public class ItemsLaptop {
    public static Set<Laptop> createLaptop () {
        Set<Laptop> set = new HashSet<>();
        set.add(new Laptop("lenovo", "silver", "windows", 64, 8));
        set.add(new Laptop("asus", "white", "windows", 64, 8));
        set.add(new Laptop("macbook", "silver", "ios", 256, 8));
        set.add(new Laptop("lenovo", "gold", "linux", 512, 16));
        return set;
    }
}
