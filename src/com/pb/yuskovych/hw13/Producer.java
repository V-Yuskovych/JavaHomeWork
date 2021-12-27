package com.pb.yuskovych.hw13;

import java.util.LinkedList;
import java.util.Random;

public class Producer implements Runnable{

    private final LinkedList<Integer> productsList;
    private final int max;

    public Producer(LinkedList<Integer> productsList, int max) {
        this.productsList = productsList;
        this.max = max;
    }

    public void run(){
        while (true) {
            try {
                synchronized (productsList) {
                    Thread.sleep(650);
                    if (productsList.size() < max) {
                        int rand = new Random().nextInt(101);
                        productsList.addLast(rand);
                        System.out.println("Producer add product number: " + rand);
                        productsList.notify();
                    } else {
                        System.out.println("Producer wait...");
                        productsList.wait();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}