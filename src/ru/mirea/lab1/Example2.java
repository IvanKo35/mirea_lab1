package ru.mirea.lab1;

import java.util.Scanner;

public class Example2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] Array = new int[10];
        int i = 0;
        int a = sc.nextInt();
        do {
            Array[i] = a;
            i++;
            a = sc.nextInt();
        } while (i != Array.length && a != 0);

        int argsMax = 0;
        int argsMin = (int) Math.pow(10,7);
        for (int k : Array) {
            if (k > argsMax) {
                argsMax = k;
            }
            if (k < argsMin) {
                argsMin = k;
            }
        }

        System.out.println("Max value " + argsMax);
        System.out.println("Min value " + argsMin);

    }
}
