package com.apple.book;

public class Dictionary extends Book {
    private int dictates;

    public int getDictates() {
        return dictates;
    }

    public void setDictates(int dictates) {
        this.dictates = dictates;
    }

    public Dictionary(String BookIP, String BookName, int pages,int dictates){
        super(BookIP,BookName,pages);
        this.dictates = dictates;
    }
    public String toString(){
        return super.toString() + "," + this.dictates;
    }
}
