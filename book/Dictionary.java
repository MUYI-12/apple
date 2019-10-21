package com.apple.book;

public class Dictionary extends Book {
    private int dicpages;

    public int getDicpages() {
        return dicpages;
    }

    public void setDicpages(int dicpages) {
        this.dicpages = dicpages;
    }

    public Dictionary(String BookIP, String BookName, int pages,int dicpages){
        super(BookIP,BookName,pages);
        this.dicpages = dicpages;
    }
    public String toString(){
        return super.toString() + "," + this.dicpages;
    }

}
