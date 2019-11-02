package com.apple.six;

public class Qikan extends Reading {
    private String QikanData;

    public String getQikanData() {
        return QikanData;
    }

    public void setQikanData(String qikanData) {
        QikanData = qikanData;
    }

    public Qikan(String BookPages, String BookPrice, String QikanData){
        super(BookPages,BookPrice);
        this.QikanData = QikanData;
    }

    public String toString(){
        return super.toString() + "," + this.QikanData;
    }
}
