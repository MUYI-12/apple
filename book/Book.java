package com.apple.book;

public class Book {
    private String bookIP;
    private String bookName;

    protected int pages;

    public Book(String BookIP,String BookName,int pages){
        this.bookIP = BookIP;
        this.bookName = BookName;
        this.pages = pages;
    }

    public String toString(){
        return this.bookIP + "," + this.bookName + "," + this.pages;
    }

    public String getBookIP() {
        return bookIP;
    }

    public void setBookIP(String bookIP) {
        this.bookIP = bookIP;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
