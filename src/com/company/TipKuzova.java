package com.company;

public class TipKuzova extends Tip{
    public TipKuzova() {
        super("Тип кузова");
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        TipKuzova that = (TipKuzova) object;
        return atribut != null ? atribut.equals(that.atribut) : false;
    }
}
