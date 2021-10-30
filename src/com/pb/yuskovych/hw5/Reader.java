package com.pb.yuskovych.hw5;

public class Reader {
    private String fullName;
    private int numberLibraryCard;
    private int amountBook;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;


    public Reader(String fullName, int numberLibraryCard, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.numberLibraryCard = numberLibraryCard;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int amountBook) {
        System.out.println("\"" + this.fullName + " взял " + amountBook + " книги" + "\".");
    }

    public void takeBook(String[] books) {
        System.out.print("\"" + this.fullName + " взял следующие книги: ");
        int counter = 0;
        for (String book : books) {
            System.out.print("" + book);
            if (counter < books.length - 1) {
                System.out.print(", ");
            }
            counter++;
        }
        System.out.print("\".");
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.print("\"" + this.fullName + " взял следующие книги: ");
        int counter = 0;
        for (Book book : books) {
            System.out.print("" + book.getNameBook() + " (" + book.getAuthor() + " " + book.getYear() + " г.)");
            if (counter < books.length - 1) {
                System.out.print(", ");
            }
            counter++;
        }
        System.out.print("\".");
        System.out.println();
    }

    public void returnBook(int amountBook) {
        System.out.println("\"" + this.fullName + " вернул " + amountBook + " книги" + "\".");
    }

    public void returnBook(String[] books) {
        System.out.print("\"" + this.fullName + " вернул следующие книги: ");
        int counter = 0;
        for (String book : books) {
            System.out.print("" + book);
            if (counter < books.length - 1) {
                System.out.print(", ");
            }
            counter++;
        }
        System.out.print("\".");
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.print("\"" + this.fullName + " вернул следующие книги: ");
        int counter = 0;
        for (Book book : books) {
            System.out.print("" + book.getNameBook() + " (" + book.getAuthor() + " " + book.getYear() + " г.)");
            if (counter < books.length - 1) {
                System.out.print(", ");
            }
            counter++;
        }
        System.out.print("\".");
        System.out.println();
    }

    public String informationOfReaders() {
        return (fullName + " " + numberLibraryCard + " "
                + faculty + " " + dateOfBirth + " " + phoneNumber);
    }
}
