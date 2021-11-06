package com.pb.yuskovych.hw6;

public class Animal {
    public String food,location;


    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise(){
        System.out.println("Какое-то животное издает звук");
    }
    public void eat(){
        System.out.println("Какое-то животное ест");
    }
    public void sleep(){
        System.out.println("Какое-то животное спит");
    }


}
