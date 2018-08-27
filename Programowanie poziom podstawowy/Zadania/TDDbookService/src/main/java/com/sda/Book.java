package com.sda;

public class Book {

    private String booksTitle;
    private String authorBooks;
    private double price;

    public Book(String booksTitle, String authorBooks, double price) {
        this.booksTitle = booksTitle;
        this.authorBooks = authorBooks;
        this.price = price;
    }

    public String getBooksTitle() {
        return booksTitle;
    }

    public void setBooksTitle(String booksTitle) {
        this.booksTitle = booksTitle;
    }

    public String getAuthorBooks() {
        return authorBooks;
    }

    public void setAuthorBooks(String authorBooks) {
        this.authorBooks = authorBooks;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
