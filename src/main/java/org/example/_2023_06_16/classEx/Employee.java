package org.example._2023_06_16.classEx;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
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

    public void m(Integer... i) {
    }

    @Override
    // o1.equals(o2)
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return age == employee.age
                && Objects.equals(name, employee.name)
                && department == employee.department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, department);
    }

    /**
     * hashCode - цифровое представление объекта
     * == - находится ли по тому же адресу?
     * equals - такое же значение?
     * instance of - является ли экземпляром какого либо класса?
     */



    @Override
    public String toString() {
        return "Employee: ["
                + name
                + " : " + age
                + " : " + department + "]";
    }
}