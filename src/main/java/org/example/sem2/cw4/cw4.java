package org.example.sem2.cw4;

import org.example.sem2.cw4.model.Vector;

public class cw4 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0, 1.0, 1.0);
        Vector vector2 = new Vector(1.0, 2.0, 1.0);
        System.out.println(vector1);
        System.out.println(vector2);
        System.out.println("Длинна вектора = " + vector1.lenghtVector());
        System.out.println("Скалярное произведение = " + vector1.scalarMulti(vector2));
        System.out.println("Векторное произведение = " + vector1.vectorMulti(vector2));
        System.out.println("Косинус угла = "+vector1.cosinusVector(vector2));
        System.out.println("Сумма: " + vector1.sumVector(vector2));
        System.out.println("Разность: " + vector1.difVector(vector2));
    }

}
