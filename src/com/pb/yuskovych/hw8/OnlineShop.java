package com.pb.yuskovych.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
    try {
        String login;
        String password;
        String confirmPasswd;
        Auth auth = new Auth();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в OnlineShop. Пройдите регистрацию:");
        System.out.println(" ");
        System.out.print("Введите логин: ");
        login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        password = scanner.nextLine();
        System.out.print("Повторите пароль: ");
        confirmPasswd = scanner.nextLine();
        System.out.println(" ");
        auth.signUp(login, password, confirmPasswd);

        System.out.println("Пройдите авторизацию в OnlineShop");
        System.out.print("Введите логин: ");
        login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        password = scanner.nextLine();
        System.out.println(" ");
        auth.signIn(login, password);

    } catch (WrongLoginException | WrongPasswordException ex) {
        System.err.println(ex.getMessage());
    }
}
}