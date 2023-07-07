package org.example._2023_06_30.col;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        List<Integer> list = new ArrayList<>();


        list.add(15);
        list.add(23);
        list.add(3);
        list.add(55);

        System.out.println(list);
        list.add(0, 9999);
        System.out.println(list);

        System.out.println(list.indexOf(55));

        for (int i = 0; i < list.size(); i++) {
            list.set(i, 66666);
        }
    }
}
