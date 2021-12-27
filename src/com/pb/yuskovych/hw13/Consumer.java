package com.pb.yuskovych.hw13;

import java.util.LinkedList;

public class Consumer implements Runnable{
    private final LinkedList<Integer> productsList;

    public Consumer(LinkedList<Integer> productsList) {
        this.productsList = productsList;
    }

    public void run(){
        while (true) {
            try {
                synchronized (productsList) {
                    Thread.sleep(650);
                    if (productsList.size() > 0) {
                        productsList.getFirst();
                        System.out.println("Consumer took product number: " + productsList.getFirst());
                        productsList.removeFirst();
                        productsList.notify();
                    } else {
                        System.out.println("Consumer wait...");
                        productsList.wait();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}