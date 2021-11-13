package com.pb.yuskovych.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {

    Pants(Size size, String color, int price) {
        super(size, color, price);
    }

    @Override
    public void dressMan() {
        System.out.println("Штаны, " + clothesSize + " (" + clothesSize.getEuroSize() + ") " + clothesSize.getDescription()
                + " Цвет: " + color + "," + " Цена: " + price  + " грн" );
    }

    @Override
    public void dressWomen() {
        System.out.println("Штаны, " + clothesSize + " (" + clothesSize.getEuroSize() + ") " + clothesSize.getDescription()
                + " Цвет: " + color + "," + " Цена: " + price  + " грн" );
    }
}
