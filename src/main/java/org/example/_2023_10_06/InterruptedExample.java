package org.example._2023_10_06;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class InterruptedExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Start");
        ConcurrentHashMap<String, Integer> map
                = new ConcurrentHashMap<>();

        map.put("null", 2);


        InterruptedTest thread = new InterruptedTest();
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();

        thread.join();
        System.out.println("Main end");
    }
}

class InterruptedTest extends Thread {
    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            if (isInterrupted()) {
                System.out.println("Potok hotyat prervat'");
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                Thread.sleep(900);
            } catch (InterruptedException e) {
                System.out.println("Potok hotyat prervat' vo vremya sna");
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}
