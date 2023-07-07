package org.example._2023_07_07;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.example._2023_07_07.compare.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Mikhail");
        map.put(2, "Artemii");
        map.put(3, "Raman");
        map.put(4, "Olga");
        map.put(5, "Lera");
        map.put(null, null);
        map.put(null, "44");

        System.out.println(map.isEmpty());
        System.out.println(map.containsKey(8));
        System.out.println(map);

//        Map<Dog, Integer> integerMap = new TreeMap<>();
//        integerMap.put(new Dog("W", 1), 1);
//        integerMap.putIfAbsent(new Dog("W", 1), 2);
//        integerMap.containsKey()
//
//        System.out.println(integerMap);

    }
}

@Getter
@ToString
@AllArgsConstructor
class Dog implements Comparable<Dog>{

    private String name;
    private int age;

    @Override
    public int compareTo(Dog o) {
        return this.name.compareTo(o.name);
    }
}

