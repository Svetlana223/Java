package org.example.sem6.homework.model;

import java.util.*;


import lombok.Data;

@Data

public class Filter extends Laptop {
    public Filter(String name, String color, String operatingSystem, Integer rom, Integer ram) {
        super(name, color, operatingSystem, rom, ram);
    }

    public Filter() {
    }


    public void filter(Set<Laptop> laptopsSet) {
        HashSet<Laptop> laptops = new HashSet<>(laptopsSet);
        System.out.print("Введите цифру, соответствующую необходимому критерию: \n " +
                "1 - Название: \n" +
                "2 - ОЗУ: \n" +
                "3 - Объем ЖД: \n" +
                "4 - Операционная система \n" +
                "5 - Цвет");
        Scanner sc = new Scanner(System.in);
        int choise = sc.nextInt();

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "name");
        map.put(2, "ram");
        map.put(3, "rom");
        map.put(4, "operatingSystem");
        map.put(5, "color");

        Map<Integer, String> setMap = new HashMap<>();
        for (Laptop item: laptops) {
            setMap.put();

        }


        switch (choise) {
            case 1 -> this.setName(askString());
            case 2 -> this.setRam(askInt());
            case 3 -> this.setRom(askInt());
            case 4 -> this.setOperatingSystem(askString());
            case 5 -> this.setColor(askString());
        }



    }


    private static Integer askInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите параметр: ");
        return sc.nextInt();
    }

    private static String askString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите параметр: ");
        return sc.nextLine();
    }


}