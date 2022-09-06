package com.example.redditcloneandroid.model;

import com.example.redditcloneandroid.model.enums.Reakcija;

public class OdgNaPost {

    private int idOdgP;
    private Reakcija reakcija;
    private String timestamp;
    private int idKorP;
    private int idPost;

    public OdgNaPost(int idOdgP, Reakcija reakcija, String timestamp, int idKorP, int idPost) {

        this.timestamp = timestamp;
        this.idKorP = idKorP;
        this.idPost = idPost;
        this.idOdgP = idOdgP;
        this.reakcija = reakcija;
    }

    public OdgNaPost(){

    }



    public int getIdKorP() {
        return idKorP;
    }

    public void setIdKorP(int idKorP) {
        this.idKorP = idKorP;
    }

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public int getIdOdgP() {
        return idOdgP;
    }

    public void setIdOdgP(int idOdgP) {
        this.idOdgP = idOdgP;
    }

    public Reakcija getRakcija() { return reakcija;
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
