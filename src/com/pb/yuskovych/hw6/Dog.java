package com.pb.yuskovych.hw6;

import java.util.Objects;

public class Dog extends Animal {

    public String breed;

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав-гав");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    @Override
    public String toString() {
        return "Dog: breed = " + breed + ", food = " + food + ", location = " + location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return breed == dog.breed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed);
    }
}