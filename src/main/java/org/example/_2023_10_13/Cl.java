package org.example._2023_10_13;

import java.util.*;

public class Cl {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(25));
        }

        List<Integer> target = new LinkedList<>();
        List<Integer> s = Collections.synchronizedList(new ArrayList<>());
        Runnable runnable = () -> target.addAll(list);

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(target);
    }
}
