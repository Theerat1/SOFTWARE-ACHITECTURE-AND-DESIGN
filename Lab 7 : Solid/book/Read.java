package com.solid.book;

public class Read implements Printer{

    public void print(Book book) {
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}
