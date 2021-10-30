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

        String string1OnlyChar = onlyNumbersAndLetters(string1);
        String string2OnlyChar = onlyNumbersAndLetters(string2);

        System.out.println("Строки анограммы: " + anagramOrNot(string1OnlyChar, string2OnlyChar));

    }

    public static String onlyNumbersAndLetters(String string) {
        StringBuilder strB = new StringBuilder();
        String chars1 = string.toLowerCase(Locale.ROOT);

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetterOrDigit(chars1.charAt(i))) {
                strB.append(chars1.charAt(i));
            }
        }
        return strB.toString();
    }

    public static boolean anagramOrNot(String string1OnlyChar, String string2OnlyChar) {
        char[] char1 = string1OnlyChar.toCharArray();
        char[] char2 = string2OnlyChar.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        String ch1 = new String(char1);
        String ch2 = new String(char2);

        return ch1.equals(ch2);
    }
}
