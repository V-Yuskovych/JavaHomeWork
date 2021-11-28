package com.pb.yuskovych.hw10;

public class Main {
    public static void main(String args[]) {
        NumBox<Float> b = new NumBox<Float>(5);
            b.add(11.22F);
            b.add(22.33F);
            b.add(44.44F);
            b.add(55.55F);
            b.add(66.77F);

        System.out.println("Размер массива: " + b.length());
        System.out.println("Среднее значение массива: " + b.average());
        System.out.println("Сумма массива: " + b.sum());
        System.out.println("Максимальное значение массива: " + b.max());
        System.out.println(" ");

        NumBox<Integer> a = new NumBox<Integer>(5);
            a.add(27);
            a.add(48);
            a.add(59);
            a.add(44);
            a.add(60);

        System.out.println("Размер массива: " + a.length());
        System.out.println("Среднее значение массива: " + a.average());
        System.out.println("Сумма массива: " + a.sum());
        System.out.println("Максимальное значение массива: " + a.max());
    }
}
