package com.pb.yuskovych.hw7;

public class Skirt extends Clothes implements WomenClothes {

    Skirt(Size size, String color, int price) {
        super(size, color, price);
    }

    @Override
    public void dressWomen() {
        System.out.println("Юбка, " + clothesSize + " (" + clothesSize.getEuroSize() + ") " + clothesSize.getDescription()
                + " Цвет: " + color + "," + " Цена: " + price  + " грн" );
    }
}