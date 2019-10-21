package com.apple.book;

public class BookManager {
    public static void main(String[] args){
        Book book = new Book("INM001","tact",90);
        System.out.println(book.toString());
        Dictionary dictionary = new Dictionary("001INM001","tact",90,6);
        System.out.println(dictionary.toString());
        //System.out.println(book.getBookIP());
    }
}

