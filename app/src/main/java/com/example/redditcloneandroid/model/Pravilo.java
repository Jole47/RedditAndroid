package com.example.redditcloneandroid.model;

public class Pravilo {

    private int idPra;
    private String oPravilu;
    private int zajednica;

    public Pravilo(int idPra, String oPravilu, int zajednica) {

        this.zajednica = zajednica;
        this.idPra = idPra;
        this.oPravilu = oPravilu;
    }

    public Pravilo(){

    }



    public int getZajednica() {
        return zajednica;
    }

    public void setZajednica(int zajednica) {
        this.zajednica = zajednica;
    }
    public int getIdPra() {
        return idPra;
    }

    public void setIdPra(int idPra) {
        this.idPra = idPra;
    }

    public String getoPravilu() {
        return oPravilu;
    }

    public void setoPravilu(String oPravilu) {
        this.oPravilu = oPravilu;
    }

}
