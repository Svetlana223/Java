package org.example.sem2.homework.hm1;
import java.util.Scanner;

//Дана последовательность N целых чисел. Найти сумму простых чисел.
public class hm1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите количество чисел в массиве: ");
        int n = scan.nextInt();
        System.out.printf("Cумма простых чисел = " + sumSimpleNumbers(n));
        scan.close();
    }


    public static int sumSimpleNumbers(int n) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int number = scan.nextInt();
            if (simpleNumber(number)) {
                sum += number;
            }
        }
        return sum;
    }

    public static boolean simpleNumber(int num) {

        Double sqrt = Math.sqrt(num);
        if (num < 0) {
            return false;
        }
        for (int i = 2; i <= sqrt.intValue(); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}

