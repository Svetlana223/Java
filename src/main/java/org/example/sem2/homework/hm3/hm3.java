package org.example.sem2.homework.hm3;

import java.util.Arrays;
import java.util.Scanner;

//Дан массив целых чисел.
// Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
public class hm3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введиhте количество чисел в массиве: ");
        int size = scan.nextInt();
        System.out.println(Arrays.toString(replaceArray(size)));
        scan.close();
    }

    public static int[] replaceArray(int size) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 9 && array[i] < 100 || (array[i] > -100 && array[i] < -9)) {
                sum += i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = sum;
            }
        }
        return array;
    }
}
