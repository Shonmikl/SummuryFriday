package org.example._2023_06_16;

import java.io.StringReader;

public class Person {
    int age;
    String name;
    float salary;
    Person[] people;

    public Person(int age, String name, float salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
}

class Emp extends Person {

    public Emp(int age, String name, float salary) {
        super(age, name, salary);
    }
}