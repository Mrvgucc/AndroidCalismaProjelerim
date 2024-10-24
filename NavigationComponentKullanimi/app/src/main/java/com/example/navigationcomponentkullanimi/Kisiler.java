package com.example.navigationcomponentkullanimi;

import java.io.Serializable;

public class Kisiler implements Serializable { //Serializable implement etmek veri transferi icin gereklidir aksi halde hata aliriz
private int kisiNo;
private String kisiAd;

public Kisiler(){
    //bos constructor
}
public Kisiler(int kisiNo,String kisiAd){
    this.kisiAd = kisiAd;
    this.kisiNo = kisiNo;
}

    public int getKisiNo() {
        return kisiNo;
    }

    public void setKisiNo(int kisiNo) {
        this.kisiNo = kisiNo;
    }

    public String getKisiAd() {
        return kisiAd;
    }

    public void setKisiAd(String kisiAd) {
        this.kisiAd = kisiAd;
    }
}
