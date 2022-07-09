package ru.mirea.lab1;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Array = new int[10];
        int Sum = 0;
        double ArithmeticAverage;
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
            Sum+= Array[i];
        }
        ArithmeticAverage = (double)Sum/Array.length;
        System.out.println(Sum);
        System.out.println(ArithmeticAverage);
    }
}
