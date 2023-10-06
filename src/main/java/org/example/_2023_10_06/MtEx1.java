package org.example._2023_10_06;

public class MtEx1 extends Thread {
    volatile boolean b = true;

    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("COUNTER: " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        MtEx1 thread = new MtEx1();
        thread.start();
        Thread.sleep(1000);

        System.out.println("Wake up!");
        thread.b = false;
        thread.join();
        System.out.println("END");
    }
}