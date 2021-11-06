package com.pb.yuskovych.hw6;

import java.util.Objects;

public class Cat extends Animal {

    public boolean mouseHunter;

    public Cat(String food, String location, boolean mouseHunter) {
        super(food, location);
        this.mouseHunter = mouseHunter;
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу-мяу");;
    }

    @Override
    public void eat() {
        System.out.println("Кот ест");
    }

    @Override
    public String toString() {
        return "Cat: mouseHunter = " + mouseHunter + ", food = " + food + ", location = " + location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return mouseHunter == cat.mouseHunter;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mouseHunter);
    }
}