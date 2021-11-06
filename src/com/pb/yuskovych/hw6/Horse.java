package com.pb.yuskovych.hw6;

import java.util.Objects;

public class Horse extends Animal {

    public int speed;

    public Horse(String food, String location, int speed){
        super(food, location);
        this.speed = speed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Иго-го");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест");
    }
    @Override
    public String toString() {
        return "Horse: speed = " + speed + ", food = " + food + ", location = " + location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(speed, horse.speed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
