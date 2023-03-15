package org.example.sem3.homework.hm1;

import org.example.sem3.homework.hm1.model.Note;

import java.util.ArrayList;
import java.util.List;

//1. Дан массив записей: наименование товара, цена, сорт.
// Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
public class ex1 {
    public static void main(String[] args) {
        Note note = new Note("мука высший", 80.20, 1);
        Note note1 = new Note("яйцо", 60.25, 2);
        Note note2 = new Note("молоко высший", 70.30, 2);

        List<Note> listProduct = new ArrayList<>();
        listProduct.add(note);
        listProduct.add(note1);
        listProduct.add(note2);
        double max = 0;

        for (Note el: listProduct) {
            if (el.getProduct().contains("высший")&& el.getGrade().equals(1)||el.getProduct().contains("высший")&& el.getGrade().equals(2)){
                if (el.getPrice()>max){
                    max = el.getPrice();
                }
            }
        }
        System.out.println(max);

    }
}
