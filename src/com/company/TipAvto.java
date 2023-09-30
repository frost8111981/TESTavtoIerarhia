package com.company;

public class TipAvto extends Tip{
    public TipAvto() {
        super("Тип авто");
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        TipAvto that = (TipAvto) object;
        return atribut != null ? atribut.equals(that.atribut) : false;
    }
}
