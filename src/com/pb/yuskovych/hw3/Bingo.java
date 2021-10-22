package com.pb.yuskovych.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int secterNumber;
        int counter = 0;
        int number;
        int stop = 777;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Игра BINGO началась!");
        System.out.println("Угадайте загаданное число:");
        secterNumber = random.nextInt(101);

        while (counter < 1000) {
            number = scanner.nextInt();
            counter++;
            if (number == secterNumber) {
                System.out.println("B I N G O - загаданное число: " + secterNumber +
                        "\nПопыток понадобилось " + counter);
                System.out.println("Конец игры!");
                break;
            }
            if (number > secterNumber) {
                System.out.println("Попробуйте ещё, загаданное число меньше вводимого");
                continue;
            }
            if (number < secterNumber) {
                System.out.println("Попробуйте ещё, загаданное число больше вводимого");
                continue;
            }
            if (number == stop) {
                System.out.println("Конец игры!");
                break;
            }
        }
    }
}

