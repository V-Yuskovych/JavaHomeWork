package com.pb.yuskovych.hw8;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String msg) {
        super(msg);
    }
}