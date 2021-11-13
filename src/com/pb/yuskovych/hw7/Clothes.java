package com.pb.yuskovych.hw7;

public abstract class Clothes {

    Size clothesSize;
    String color;
    int price;

    public Clothes(Size clothesSize, String color, int price) {
        this.clothesSize = clothesSize;
        this.color = color;
        this.price = price;
    }
}
