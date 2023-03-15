package org.example.sem3.homework.hm3;

import org.example.sem3.homework.hm3.model.Books;

import java.util.ArrayList;
import java.util.List;

//Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
// Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
public class ex3 {
    public static void main(String[] args) {
        Books books1 = new Books("Полет", "Чайка", 120.5, 1999, 130);
        Books books2 = new Books("Принцип", "Найка", 120.5, 2013, 130);
        Books books3 = new Books("Книга", "Арин", 120.5, 2015, 97);
        Books books4 = new Books("Печать", "Акин", 120.5, 2013, 89);

        List<Books> listBooks = new ArrayList<>();
        listBooks.add(books1);
        listBooks.add(books2);
        listBooks.add(books3);
        listBooks.add(books4);

        for (Books el: listBooks) {
            if (el.getAuthor().contains("А") && el.getYear() > 2009 && simpleNumber(el.getPage())){
                System.out.println(el.getName());
            }
        }


    }


    public static boolean simpleNumber(int num) {
        Double sqrt = Math.sqrt(num);
        for (int i = 2; i <= sqrt.intValue(); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
