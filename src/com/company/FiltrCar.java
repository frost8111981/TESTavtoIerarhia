package com.company;

public class FiltrCar {
    private CarAd[] adList;

    public void setAdList(CarAd[] adList) {
        this.adList = adList;
    }

    public void filtrTipAvto(TipAvto tipAvto) {
        for (CarAd ad : adList) {
            if (ad.getTipAvto().equals(tipAvto)) {
                System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                        + tipAvto.getTipName() + ", атрибут фильтра " + tipAvto.getAtributeOfTip());
            } else {
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто - " + tipAvto.getTipName() + ", критерий- " +
                        tipAvto.getAtributeOfTip() + ", так как имеет тип авто " +
                        ad.getTipAvto().getTipName());
            }
        }
    }

    public void filtrTipKuzova(TipKuzova tipKuzova) {
        for (CarAd ad : adList) {
            if (ad.getTipKuzova().equals(tipKuzova)) {
                System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                        + tipKuzova.getTipName() + ", атрибут фильтра " + tipKuzova.getAtributeOfTip());
            } else {
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто - " + tipKuzova.getTipName() + ", критерий- " +
                        tipKuzova.getAtributeOfTip() + ", так как имеет тип авто " +
                        ad.getTipKuzova().getTipName());
            }
        }
    }

    public void filtrTipTopliva(TipTopliva tipTopliva) {
        for (CarAd ad : adList) {
            if (ad.getTipTopliva().equals(tipTopliva)) {
                System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                        + tipTopliva.getTipName() + ", атрибут фильтра " + tipTopliva.getAtributeOfTip());
            } else {
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто - " + tipTopliva.getTipName() + ", критерий- " +
                        tipTopliva.getAtributeOfTip() + ", так как имеет тип авто " +
                        ad.getTipTopliva().getTipName());
            }
        }
    }
}
