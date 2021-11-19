package com.pb.yuskovych.hw8;

public class Auth {
    private String login;
    private String password;

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length()>=5 && login.length()<=20 && login.matches("[a-zA-Z0-9]+")) {
            this.login = login;
        } else {
            throw new WrongLoginException("Ошибка! Логин введен некорректно.");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Ошибка! Пароль введен некорректно.");
        }
        if (password.length()>=5 && password.matches("[a-zA-Z0-9_]+")) {
            this.password = password;
        } else {
            throw new WrongPasswordException("Ошибка! Пароль введен некорректно.");
        }
    }

    public void signIn(String login, String password) throws WrongLoginException {
        if (this.login.equals(login) && this.password.equals(password)) {
            System.out.println("Вы успешно авторизировались в нашем OnlineShop");
        } else {
            throw new WrongLoginException("Ошибка! Неверный логин или пароль.");
        }
    }
}
