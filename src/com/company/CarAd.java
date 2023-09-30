package com.company;

public class CarAd {
    private String model;
    private String id;
    private TipAvto tipAvto;
    private TipKuzova tipKuzova;
    private TipTopliva tipTopliva;

    public CarAd(String model, String id, TipAvto tipAvto, TipKuzova tipKuzova, TipTopliva tipTopliva) {
        this.model = model;
        this.id = id;
        this.tipAvto = tipAvto;
        this.tipKuzova = tipKuzova;
        this.tipTopliva = tipTopliva;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TipAvto getTipAvto() {
        return tipAvto;
    }

    public void setTipAvto(TipAvto tipAvto) {
        this.tipAvto = tipAvto;
    }

    public TipKuzova getTipKuzova() {
        return tipKuzova;
    }

    public void setTipKuzova(TipKuzova tipKuzova) {
        this.tipKuzova = tipKuzova;
    }

    public TipTopliva getTipTopliva() {
        return tipTopliva;
    }

    public void setTipTopliva(TipTopliva tipTopliva) {
        this.tipTopliva = tipTopliva;
    }
}
