package com.pb.yuskovych.hw5;

public class Book {
    private String nameBook;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.nameBook = name;
        this.author = author;
        this.year = year;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String informationOfBooks() {
        return (nameBook + "/ " + author + "/ " + year );
    }
}
