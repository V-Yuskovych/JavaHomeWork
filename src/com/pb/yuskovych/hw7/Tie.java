package com.pb.yuskovych.hw7;

public class Tie extends Clothes implements ManClothes{

    Tie(Size size, String color, int price) {
        super(size, color, price);
    }

    @Override
    public void dressMan() {
        System.out.println("Галстук, " + clothesSize + " (" + clothesSize.getEuroSize() + ") " + clothesSize.getDescription()
                + " Цвет: " + color + "," + " Цена: " + price  + " грн" );
    }
}