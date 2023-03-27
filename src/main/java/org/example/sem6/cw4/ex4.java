package org.example.sem6.cw4;

import org.example.sem6.cw4.model.Celsius;
import org.example.sem6.cw4.model.Farenheit;
import org.example.sem6.cw4.model.Kelvin;

public class ex4 {
    //    4) Напишите интерфейс Converter для конвертации из градусов по Цельсию в
//    Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод интерфейса,
//    для валидного перевода величин. Метод для конвертации назовите "convertValue".
    public static void main(String[] args) {
        Double t = 220.00;
        Double tCel = new Celsius().convert(t);
        System.out.println(tCel);
        Double tFar = new Farenheit().convert(t);
        System.out.println(tFar);
        Double tKel = new Kelvin().convert(t);
        System.out.println(tKel);
    }
}
