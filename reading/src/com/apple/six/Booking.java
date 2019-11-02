package com.apple.six;

public class Booking extends Reading{
    private String bo;

    public String getBo() {
        return bo;
    }

    public void setBo(String bo) {
        this.bo = bo;
    }

    public Booking(String BookPages, String BookPrice, String bo){
        super(BookPages,BookPrice);
        this.bo= bo;
    }

    public String toString(){
        return super.toString() + "," + this.bo;
    }
}
