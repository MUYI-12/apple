package com.classbook.chapter.six;

public class Bookmanager {
    public static void main(String[] args){

        Book book = new Book("001","bom",100);
        Dictionary dictionary = new Dictionary("001","bom",100,10);
        System.out.println(book.toString());
        System.out.println(dictionary.toString());
        System.out.println(book.getBookid());
        System.out.println(dictionary.getBookid());
        Book book1 = new Dictionary("001","bom",100,10);
        System.out.println(book1.toString());
    }

}
