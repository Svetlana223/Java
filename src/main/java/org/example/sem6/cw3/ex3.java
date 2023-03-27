package org.example.sem6.cw3;
import java.util.*;
public class ex3 {
    public static void main(String[] args) {
//        3)Найти пересечения слов в массивах и указать их общее количество.
//        Пример:
//        Mas1= [“qwe”,”asd”,”qwe”,”x”]
//        Mas2=[“qwe”,”v”]
//        Результат:
//        qwe=3
        List<String> inputArray1 = new ArrayList<>(List.of("qwe","asd","qwe","x"));
        List<String> inputArray2 = new ArrayList<>(List.of("qwe","v"));

        Set<String> cross = new HashSet<>(inputArray1);
        List<String> all = new ArrayList<>(inputArray1);
        all.addAll(inputArray2);
        cross.retainAll(inputArray2);

        for(String item : cross){
            int count = 0;
            for (String allItem : all){
                if(item.equals(allItem)) count++;
            }
            System.out.println(item + " " + count);
        }
    }
}
