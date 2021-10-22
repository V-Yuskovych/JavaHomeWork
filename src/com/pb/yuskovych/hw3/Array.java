package com.pb.yuskovych.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;
        int positiveNumber = 0;
        int exchange;
        boolean sorting = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 10 элементов массива:");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Вы ввели масcив: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] > 0) {
                positiveNumber++;
            }
        }
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Количество положительных элементов массива: " + positiveNumber);

        while (!sorting) {
            sorting = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    sorting = false;

                    exchange = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = exchange;
                }
            }
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

}

