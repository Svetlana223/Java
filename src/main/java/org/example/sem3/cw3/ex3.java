package org.example.sem3.cw3;
//Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах), его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.). Найти:
//        - количество кубиков желтого цвета и их суммарный объем;
//        - количество деревянных кубиков с ребром 3 см

import org.example.sem3.cw3.model.Coub1;

import java.util.ArrayList;
import java.util.List;

public class ex3 {
    public static void main(String[] args) {

        Coub1 coub1 = new Coub1("зеленый", 13, "деревянный");
        Coub1 coub2 = new Coub1("желтый", 73, "металлический");
        Coub1 coub3 = new Coub1("красный", 23, "картонный");
        Coub1 coub4 = new Coub1("желтый", 3, "металлический");

        List<Coub1> listCoub = new ArrayList<>();
        listCoub.add(coub1);
        listCoub.add(coub2);
        listCoub.add(coub3);
        listCoub.add(coub4);
        int countCoub = 0;
        int sumVolume = 0;
        int countWood = 0;
        for (Coub1 coub : listCoub) {
            if (coub.getColor().equals("желтый")) {
                countCoub++;
                sumVolume += volumeCoub(coub.getSize());
            }
            if (coub.getMaterial().equals("деревянный") && coub.getSize() == 3) {
                countWood++;
            }
        }
        System.out.println(countCoub);
        System.out.println(sumVolume);
        System.out.println(countWood);
    }

    public static int volumeCoub(Integer size) {
        return size * size * size;
    }
}
