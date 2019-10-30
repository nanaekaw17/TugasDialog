package com.example.proteintracker.Model;

import android.graphics.Bitmap;
import android.widget.ImageView;

public class Mahasiswa {
    public Mahasiswa(String telo, String npm, String noHp) {
        this.telo = telo;
        this.npm = npm;
        this.noHp = noHp;
    }

    public String getTelo() {
        return telo;
    }

    public void setTelo(String telo) {
        this.telo = telo;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    private String telo;
    private String npm;
    private String noHp;


}