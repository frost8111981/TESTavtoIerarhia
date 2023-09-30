package com.company;

public class Tip {
    protected String atribut;

    public Tip(String atribut) {
        this.atribut = atribut;
    }

    public String getAtributeOfTip() {
        return atribut;
    }
    public String getTipName() {
        return "Название типа";
    }
}
