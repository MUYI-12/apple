package com.classwork.chapter.six;

public class Dictionary extends Book {
    private int bushoupages;

    public int getBushoupages() {
        return bushoupages;
    }

    public void setBushoupages(int bushoupages) {
        this.bushoupages = bushoupages;
    }

    public Dictionary(String bookid, String bookname, int pages, int bushoupages){
        super(bookid,bookname,pages);
        this.bushoupages = bushoupages;
    }

    public String toString(){
        return super.toString() + "," + this.bushoupages;
    }

    @Override
    public String getBookid() {
        return Defaultdic.BOOK_SUK + super.getBookid();
    }
}
