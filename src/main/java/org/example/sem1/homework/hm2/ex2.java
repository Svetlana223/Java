package org.example.sem1.homework.hm2;

import java.util.Scanner;

// Дана последовательность целых чисел,
// оканчивающаяся нулем. Найти сумму положительных чисел,
// после которых следует отрицательное число.1 2 -3
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a = sc.nextInt();
        while (a != 0) {
            int lastNum = a;
            a = sc.nextInt();
            if (a != 0) {
                if(lastNum > 0 && a < 0){
                    sum += lastNum;
                }
            }
        }
        System.out.println("summa: " + sum);
        sc.close();
    }
}