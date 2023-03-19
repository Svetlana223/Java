package org.example.sem4.homework.hm1;


import java.util.Arrays;
import java.util.LinkedList;

//1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
//        Пример:
//        1 -> 2->3->4
//        Вывод:
//        4->3->2->1
public class ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> someList = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("Развернутый лист: " + reversList(someList));

    }

    private static LinkedList<Integer> reversList(LinkedList<Integer> list) {
        LinkedList<Integer> revers = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            revers.add(list.get(i));
            list.remove(i);
        }
        return revers;
    }
}
