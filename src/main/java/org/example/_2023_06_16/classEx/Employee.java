package org.example._2023_06_16.classEx;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String name;
    private int age;
    private Department department;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void m1() {
    }

    public void m2() {
    }
}