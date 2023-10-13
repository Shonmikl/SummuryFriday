package org.example._2023_10_13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CHM {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Q");
        map.put(2, "A");
        map.put(3, "X");
        map.put(4, "C");
        map.put(5, "G");
        System.out.println(map);
        map.put(2, "LLL");

        Runnable runnable = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Integer i = iterator.next();
                System.out.println(i + " : " + map.get(i));
            }
        };

        Runnable runnable2 = () -> {
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                map.put(6, "UU");
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(map);
    }
}
