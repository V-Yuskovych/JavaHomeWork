package com.pb.yuskovych.hw4;

import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String string1, string2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        string1 = scanner.nextLine();

        System.out.println("Введите вторую строку: ");
        string2 = scanner.nextLine();

        String stringNumbersAndLetters1 = onlyNumbersAndLetters(string1);
        String stringNumbersAndLetters2 = onlyNumbersAndLetters(string2);

        System.out.println("Строки анограммы: " + anagramOrNot(stringNumbersAndLetters1, stringNumbersAndLetters2));

    }

    public static String onlyNumbersAndLetters(String string) {
        StringBuilder strB = new StringBuilder();
        String string3 = string.toLowerCase(Locale.ROOT);

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetterOrDigit(string3.charAt(i))) {
                strB.append(string3.charAt(i));
            }
        }
        return strB.toString();
    }

    public static boolean anagramOrNot(String string4, String string5) {
        char[] char1 = string4.toCharArray();
        char[] char2 = string5.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        String string6 = new String(char1);
        String string7 = new String(char2);

        return string6.equals(string7);
    }
}
