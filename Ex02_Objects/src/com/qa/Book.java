package com.qa;

import java.util.Arrays;

public class Book {
    private String name ;
    private String[] author;
    private int price;

    public Book(String name, String[] author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String[] getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + Arrays.toString(author) +
                ", price=" + price +
                '}';
    }
}
