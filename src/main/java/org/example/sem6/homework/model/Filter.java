package org.example.sem6.homework.model;

import java.util.*;

public class Filter {
    public static void filter(Set laptopsSet){
        HashSet<Laptop> laptops = new HashSet<>(laptopsSet);
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "ram");
        map.put(2, "rom");
        map.put(3,"operatingSystem");
        map.put(4, "color");

        Scanner scanner = new Scanner(System.in);
        System.out.println("“Введите цифру, соответствующую необходимому критерию:\n" +
                "1 - ОЗУ\n" +
                "2 - Объем ЖД\n" +
                "3 - Операционная система\n" +
                "4 - Цвет\n");
        int n = scanner.nextInt();
        for (Laptop el: laptops) {
            System.out.println(el);
        }
        if (n == 1) {
            System.out.println("Введите необходимую память: " );
            int memory = scanner.nextInt();
            if (laptops.equals(memory)){
                System.out.println(laptops.equals(memory));
            }else System.out.println("Нет ноутбуков с данной памятью");
        }


    }

}