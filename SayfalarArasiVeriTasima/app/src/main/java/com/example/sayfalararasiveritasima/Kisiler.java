package com.example.sayfalararasiveritasima;

import java.io.Serializable;

public class Kisiler implements Serializable { //Nesneyi karsi tarafa gonderebilmek icin implement Serializable yapılmalı

    private int tcNo;
    private String isim;
    private double boy;

    public Kisiler() {
    }

    public Kisiler(int tcNo, String isim, double boy) {
        this.tcNo = tcNo;
        this.isim = isim;
        this.boy = boy;
    }

    public int getTcNo() {
        return tcNo;
    }

    public void setTcNo(int tcNo) {
        this.tcNo = tcNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }
}
