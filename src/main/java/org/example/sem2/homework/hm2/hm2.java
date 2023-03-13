package org.example.sem2.homework.hm2;

import java.util.Scanner;

// Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
public class hm2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите количество чисел: ");
        int n = scan.nextInt();
        System.out.println(increasTrue(n));
        scan.close();
    }
    public static boolean increasTrue(int n){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for (int i = 1; i < n; i++) {
            int b = scan.nextInt();
            if(a > b){
                return false;
            }
            a = b;
        }
        return true;
    }
}
