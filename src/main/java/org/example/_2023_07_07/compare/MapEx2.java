package org.example._2023_07_07.compare;

import java.util.*;

public class MapEx2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 4, 5, 6, 9, 8, 7);

        for (Integer i : list) {
            System.out.println(i * 10);
        }

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "C");
        map.put(3, "V");
        map.put(4, "F");
        map.put(5, "R");

        //перебор по паре (ключ-значение)
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        //перебор по значениям
        for (String str : map.values()) {
            System.out.println(str);
        }

        //перебор по ключам
        for (Integer i : map.keySet()) {
            System.out.println(i);
        }
    }
}