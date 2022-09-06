package com.example.redditcloneandroid.model;

import com.example.redditcloneandroid.model.enums.Reakcija;

public class OdgNaKom {

    private int idOdg;
    private Reakcija reakcija;
    private String timestamp;
    private int idKor;
    private int idKom;

    public OdgNaKom(int idOdg, Reakcija reakcija, String timestamp, int idKor, int idKom) {

        this.timestamp = timestamp;
        this.idKor = idKor;
        this.idKom = idKom;
        this.idOdg = idOdg;
        this.reakcija = reakcija;
    }

    public OdgNaKom(){

    }



    public int getIdKor() {
        return idKor;
    }

    public void setIdKor(int idKor) {
        this.idKor = idKor;
    }

    public int getIdKom() {
        return idKom;
    }

    public void setIdKom(int idKom) {
        this.idKom = idKom;
    }

    public int getIdOdg() {
        return idOdg;
    }

    public void setIdOdg(int idOdg) {
        this.idOdg = idOdg;
    }

    public Reakcija getRakcija() {
        return reakcija;
    }

    public void setRakcija(Reakcija reakcija) {
        this.reakcija = reakcija;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
