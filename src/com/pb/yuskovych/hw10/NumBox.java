package com.pb.yuskovych.hw10;

import java.util.*;

public class NumBox<T extends Number> {
    private final List <T> numList;
    private final int size;
    public NumBox (int size) {
        this.size = size;
        numList = new ArrayList<T>(size);
    }
    public void add(T x) {
        if (numList.size()<= size-1)
            numList.add(x);
        else throw new RuntimeException();
    }
    public int length() {
        return numList.size();
    }

    public double average(){
        double sum = 0;
        for (T x:numList) {
            sum=sum+x.doubleValue();
        }
        return sum / numList.size();
    }
    public double sum() {
        double sum = 0;
        for (T x : numList) {
            sum = sum + x.doubleValue();
        }
        return sum;
    }
    public T max () {
        T max = numList.get(0);
        for (T t : numList) {
            if (t.doubleValue() > max.doubleValue())
                max = t;
        }
        return max;
    }
}
