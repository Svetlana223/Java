package org.example.sem6.cw1;

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
//1)Дан массив чисел, посчитать процент уникальных чисел.
        List<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,1,2));
        Set<Integer> set = new HashSet<>(array);
        System.out.println(set);
        double pr= set.size()*100/array.size();
        System.out.println("pr = "+pr);
    }
}
