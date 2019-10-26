package com.classbook.chapter.six;

public class Book {
    private String bookid;
    private String bookname;

    protected int pages;

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Book(String bookid,String bookname,int pages){
        this.bookid = bookid;
        this.bookname = bookname;
        this.pages = pages;
    }
    public String toString(){
        return this.bookid + "," + this.bookname + "," + this.pages;
    }
}
