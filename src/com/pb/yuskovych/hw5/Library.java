package com.pb.yuskovych.hw5;

public class Library {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В.В.", 456,
                "КИ", "10.10.1999", "+380500123456");
        Reader reader2 = new Reader("Иванов И.И.", 358,
                "OA", "07.04.1995", "+380674454545");
        Reader reader3 = new Reader("Сидоров А.А.", 254,
                "ПР", "15.10.1999", "+380934754354");
        Reader[] readers = {reader1, reader2, reader3};

        Book book1 = new Book("Хоббит, или Туда и обратно", "Джон Р. Р. Толкин", 2015);
        Book book2 = new Book("Над пропастью во ржи", "Джером Сэлинджер", 2010);
        Book book3 = new Book("Преступление и наказание", "Фёдор Достоевский", 2001);
        Book book4 = new Book("451° по Фаренгейту", "Рэй Брэдбери", 2011);
        Book book5 = new Book("Атлант расправил плечи", "Рэнд Айн", 2005);
        Book book6 = new Book("Триумфальная арка", "Эрих Мария Ремарк", 1999);
        Book[] books = {book1, book2, book3, book4, book5, book6};


        for (Reader reader : readers) {
            System.out.println(reader.informationOfReaders());
        }

        System.out.println();

        for (Book book : books) {
            System.out.println(book.informationOfBooks());
        }
        System.out.println();

        reader1.takeBook(2);
        reader2.takeBook(new String[]{book4.getNameBook(), book5.getNameBook()});
        reader3.takeBook(book6,book5);

        System.out.println();

        reader1.returnBook(3);
        reader2.returnBook(new String[]{book2.getNameBook(), book1.getNameBook()});
        reader3.returnBook(book3, book4);

    }
}
