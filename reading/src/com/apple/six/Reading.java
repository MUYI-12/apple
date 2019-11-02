package com.apple.six;

public class Reading {
    private String BookPages;
    private String BookPrice;

    public String getBookPages() {
        return BookPages;
    }

    public void setBookPages(String bookPages) {
        BookPages = bookPages;
    }

    public String getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(String bookPrice) {
        BookPrice = bookPrice;
    }

    Reading(String BookPages, String BookPrice){
        this.BookPages = BookPages;
        this.BookPrice = BookPrice;
    }

    public String toString(){
        return this.BookPages + "," + this.BookPrice;
    }
}
