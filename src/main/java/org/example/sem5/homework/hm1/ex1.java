package org.example.sem5.homework.hm1;


import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ex1 {

    //    1) Подсчитать количество вхождения каждого слова
//    Пример: Россия идет вперед всей планеты. Планета — это не Россия.
//    toLoverCase().
    public static void main(String[] args) {
        Map<String, Integer> mapWord = new HashMap<>();
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.".toLowerCase();
        String str3 = str.replaceAll("[-+.^:,]", "");
        String[] str2 = str3.split(" ");


        for (int i = 0; i < str2.length; i++) {
            if (!mapWord.containsKey(str2[i])) {
                mapWord.put(str2[i], 1);
            } else mapWord.put(str2[i], mapWord.get(str2[i]) + 1);
        }
        for (var entry : mapWord.entrySet()) {
            System.out.println("Слово '" + entry.getKey()+ "'" + " - встречается - " + entry.getValue() + " раз");
        }

    }
}
