package org.example.sem3.homework.hm2;

import org.example.sem3.homework.hm2.model.Goods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
// Получить наименования товаров заданного сорта с наименьшей ценой.
public class ex2 {
    public static void main(String[] args) {
        Goods goods1 = new Goods("яблоко", "африка", 15.5, 30.15, 1);
        Goods goods2 = new Goods("апельсин", "африка", 20.3, 50.9, 2);
        Goods goods3 = new Goods("банан", "африка", 10.4, 30.15, 1);
        Goods goods4 = new Goods("ананас", "африка", 7.3, 70.15, 3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите нужный сорт: ");
        int gradeInput = scanner.nextInt();
//        System.out.println(minItem(gradeInput));
        double min = 100000;
        List<Goods> listGoods = new ArrayList<>();
        listGoods.add(goods1);
        listGoods.add(goods2);
        listGoods.add(goods3);
        listGoods.add(goods4);


        for (Goods el : listGoods) {
            if (el.getGrade().equals(gradeInput)) {
                if (el.getPrice() < min) {
                    min = el.getPrice();
                }
            }
            if (el.getPrice()== min){
                System.out.println(el.getProduct());
            }

        }

    }


}
