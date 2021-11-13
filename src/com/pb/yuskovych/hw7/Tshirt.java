package com.pb.yuskovych.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {

    Tshirt(Size size, String color, int price) {
        super(size, color, price);
    }

    @Override
    public void dressMan() {
        System.out.println("Футболка, " + clothesSize + " (" + clothesSize.getEuroSize() + ") " + clothesSize.getDescription()
                + " Цвет: " + color + "," + " Цена: " + price  + " грн" );
    }

    @Override
    public void dressWomen() {
        System.out.println("Футболка, " + clothesSize + " (" + clothesSize.getEuroSize() + ") " + clothesSize.getDescription()
                + " Цвет: " + color + "," + " Цена: " + price  + " грн" );
    }
}
