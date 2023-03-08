package org.example.sem1.homework.hm1;

import java.util.Scanner;

//Учитывая входную строку s, измените порядок слов на противоположный .
//Слово определяется как последовательность не пробельных символов.
// Слова в будут разделены хотя бы одним пробелом .s
//Возвращает строку слов в обратном порядке, объединенных одним пробелом.
// Обратите внимание , что s может содержать начальные или конечные пробелы
// или несколько пробелов между двумя словами.
// Возвращаемая строка должна содержать только один пробел, разделяющий слова.
// Не включайте никаких дополнительных пробелов.
public class ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите текст: ");
        String text = sc.nextLine();
        System.out.println(reverseWords(text));
    }
    public static String[] reverseWords(String s) {
        String[] words = s.split(" ");

        for (int i = 0; i < words.length/2; i++) {
            String tmp = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = tmp;
        }

        return words;
    }
}
