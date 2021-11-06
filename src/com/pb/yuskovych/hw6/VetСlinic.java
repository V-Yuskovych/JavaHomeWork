package com.pb.yuskovych.hw6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class VetСlinic {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Animal[] animals = {new Cat("Рыба", "Египет", true),
                new Dog("Кости", "Великобритания", "Английский бульдог"),
                new Horse("Овёс", "США", 88)};

        Class veterinarianClass = Class.forName("com.pb.yuskovych.hw6.Veterinarian");
        Constructor cst = veterinarianClass.getConstructor(new Class[]{});
        Veterinarian objVeterinarian = (Veterinarian) cst.newInstance();
        for (int i = 0; i < animals.length; i++) {
            objVeterinarian.treatAnimal(animals[i]);
        }
    }
}