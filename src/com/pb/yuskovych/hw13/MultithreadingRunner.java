package com.pb.yuskovych.hw13;

import java.util.LinkedList;

public class MultithreadingRunner {
    public static void main(String[] args) {
        LinkedList<Integer> productsList = new LinkedList<>();
        int max = 5;

        Producer producer = new Producer(productsList, max);
        Thread threadProducer = new Thread(producer, "Producer");
        threadProducer.start();

        Consumer consumer = new Consumer(productsList);
        Thread threadConsumer = new Thread(consumer, "Consumer");
        threadConsumer.start();
    }
}
