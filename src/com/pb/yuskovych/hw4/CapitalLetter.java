package com.pb.yuskovych.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        String inputString;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        inputString = scanner.nextLine();
        System.out.println("Измененная строка:\n" + meth(inputString));
    }

    public static String meth(String inputString) {
        String modifiedString = "";
        modifiedString += inputString.substring(0, 1).toUpperCase();

        for (int i = 1; i < inputString.length(); i++) {
            if (" ".equals(inputString.substring(i - 1, i)))
                modifiedString += inputString.substring(i, i + 1).toUpperCase();
            else
                modifiedString += inputString.substring(i, i + 1);
        }
        return modifiedString;
    }
}
