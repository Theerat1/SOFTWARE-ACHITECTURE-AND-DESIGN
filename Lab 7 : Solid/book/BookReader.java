package com.solid.book;

import java.util.List;

public class BookReader {
    public static void main(String[] args) {

        Printer printer = new Read();
        Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        printer.print(book);
    }
}
