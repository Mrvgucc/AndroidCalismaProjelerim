package com.example.navigationcomponent;

import java.io.Serializable;

// implements Serilizable olmazsa nesne transferi yapamayiz.
public class Kisiler implements Serializable {
    private int kisiNo;
    private String kisiAd;

    public Kisiler() {
    }

    public Kisiler(int kisiNo, String kisiAd) {
        this.kisiNo = kisiNo;
        this.kisiAd = kisiAd;
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
