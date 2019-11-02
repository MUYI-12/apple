package com.apple.six;

public class Magazine extends Reading {
    private  String MagazineData;

    public String getMagazineData() {
        return MagazineData;
    }

    public void setMagazineData(String magazineData) {
        MagazineData = magazineData;
    }

    Magazine(String BookPages, String BookPrice, String MagazineData){
        super(BookPages,BookPrice);
        this.MagazineData = MagazineData;
    }
    public String toString(){
        return super.toString() + "," + this.MagazineData;
    }

}
