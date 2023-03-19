package org.example.sem5.homework.hm2;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ex2 {
    //    Подсчитать количество искомого слова, через map (наполнением значение,
//    где искомое слово будет являться ключом), вносить все слова не нужно
    public static void main(String[] args) {
        Map<String, Integer> mapWord = new HashMap<>();
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.".toLowerCase();
        String[] list = str.toLowerCase().replaceAll("[,;:.?!()-]", "").split("\\s+");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите нужное слово: ");
        String word = scanner.nextLine().toLowerCase();
        scanner.close();
        mapWord.put(word, 0);
        for (int i = 0; i < list.length; i++) {
            if(mapWord.containsKey(list[i])){
                mapWord.put(list[i], mapWord.get(list[i]) + 1);
            }
        }
        for (var el : mapWord.entrySet()){
            System.out.print(el.getKey() + " = " + el.getValue());
        }

    }


}
