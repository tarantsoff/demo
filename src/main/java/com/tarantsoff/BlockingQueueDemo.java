package com.tarantsoff;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> strings = new ArrayBlockingQueue<>(2);

        String poll = strings.poll();// returns null

        //strings.remove(); //NoSuchElementException

        //strings.poll(5, TimeUnit.SECONDS); waits 5 seconds and return null

        System.out.println("poll = " + poll);

        //strings.take(); //infinity waiting

        strings.add("1");
        strings.add("2");

        //strings.add("2"); //throw IllegalStateException: Queue full

        //boolean offer = strings.offer("3"); // returns false immediately

        //boolean offer = strings.offer("3", 10, TimeUnit.SECONDS); return false in 10 seconds

        //System.out.println("offer = " + offer);

        //strings.put("3"); infinity waiting

        System.out.println("strings = " + strings);
    }
}
