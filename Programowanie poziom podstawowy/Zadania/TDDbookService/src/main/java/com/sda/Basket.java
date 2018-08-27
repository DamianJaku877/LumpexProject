package com.sda;

import java.util.LinkedList;

public class Basket {

    private LinkedList catalogBasket = new LinkedList();

    public void addBook(String booksTitle, String authorBooks, double price){
        Book book = new Book(booksTitle,authorBooks,price);
        catalogBasket.add(book);
    }
}
