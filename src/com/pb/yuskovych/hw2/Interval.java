package com.pb.yuskovych.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand;
        System.out.println("Введите целое число:");
        operand = scanner.nextInt();

        if (operand >= 101) {
            System.out.println("Число не попадает в один из имеющихся промежутков");
        }
        if (operand >= 0 && operand <= 14) {
            System.out.println("Промежуток [0 - 14]");
        }
        if (operand >= 15 && operand <= 35) {
            System.out.println("Промежуток [15 - 35]");
        }
        if (operand >= 36 && operand <= 50) {
            System.out.println("Промежуток [36 - 50]");
        }
        if (operand >= 51 && operand <= 100) {
            System.out.println("Промежуток [51 - 100]");
        }
    }
}

