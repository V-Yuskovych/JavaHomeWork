package com.pb.yuskovych.hw7;

public class Atelier {
    public static void main(String[] args) {

        Tshirt tshirt1 = new Tshirt(Size.L, "черный", 350);
        Tshirt tshirt2 = new Tshirt(Size.XS, "синий", 299);
        Pants pants1 = new Pants(Size.XXS, "белый", 400);
        Pants pants2 = new Pants(Size.L, "красный",699);
        Pants pants3 = new Pants(Size.M, "красный",599);
        Skirt skirt = new Skirt(Size.S, "фиолетовый", 555);
        Tie tie = new Tie(Size.S, "черный", 210);


        Clothes[] clothes = {tshirt1, tshirt2, pants1, pants2, pants3, skirt, tie};

        System.out.println("Мужская одежда:");
        dressMan(clothes);

        System.out.println(" ");

        System.out.println("Женская одежда:");
        dressWomen(clothes);
    }

    static void dressMan(Clothes[] clothes) {
        for (Clothes clothesMas : clothes) {
            if (clothesMas instanceof ManClothes) {
                ((ManClothes)clothesMas).dressMan();
            }

        }
    }

    static void dressWomen(Clothes[] clothes) {
        for (Clothes clothesMas: clothes) {
            if (clothesMas instanceof WomenClothes) {
                ((WomenClothes)clothesMas).dressWomen();
            }
        }
    }
}
