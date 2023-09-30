package com.company;

public class TipTopliva extends Tip{
    public TipTopliva() {
        super("Тип топлива");
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        TipTopliva that = (TipTopliva) object;
        return atribut != null ? atribut.equals(that.atribut) : false;
    }
}
