package com.pb.yuskovych.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1, operand2;
        String sign;
        System.out.println("Введите первое целое число:");
        operand1 = scanner.nextInt();
        System.out.println("Введите второе целое число:");
        operand2 = scanner.nextInt();
        System.out.println("Введите арефметическую операцию предложеную в скобках" +
                "\n(+,-,/,*):");
        sign = scanner.next();

        switch (sign) {
            case "+":
                System.out.println("Результат сложения = " + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Результат вычетания = " + (operand1 - operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.err.println("Разделить на ноль нельзя, введите другое число");
                    break;
                }
                System.out.println("Результат деления = " + (operand1 / operand2));
                break;
            case "*":
                System.out.println("Результат умножения = " + (operand1 * operand2));
                break;
        }
    }
}
