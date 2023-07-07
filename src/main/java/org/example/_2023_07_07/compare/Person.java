package org.example._2023_07_07.compare;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Getter
@AllArgsConstructor
@ToString
public class Person implements Comparable<Person> {
    private String name;
    private double salary;

    @Override
    //     obj1.compareTo(obj2)
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}

class SalaryComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return (int) (o1.getSalary() - o2.getSalary());
    }
}

class Main {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("apple");
//        list.add("orange");
//        list.add("kiwi");
//        list.add("banana");
//
//        Collections.sort(list);
//        System.out.println(list);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Raman", 2365));
        personList.add(new Person("Ivan", 1235));
        personList.add(new Person("Artemii", 4452));
        personList.add(new Person("Sergeis", 3890));
        personList.add(new Person("Viktar", 6250));

        Collections.sort(personList, new SalaryComparator());
        System.out.println(personList);
    }
}