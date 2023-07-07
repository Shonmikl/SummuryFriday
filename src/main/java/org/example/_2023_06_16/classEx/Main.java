package org.example._2023_06_16.classEx;

import javax.crypto.spec.PSource;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Employee emp1
                = new Employee("Mik", 35, Department.IT);
        Employee emp1test
                = new Employee("Mik", 35, Department.IT);
        Employee emp2
                = new Employee("Ju", 25, Department.HR);
        Employee emp3
                = new Employee("Wal", 30, Department.FINANCE);
        Employee emp4
                = new Employee("Jan", 28, Department.SALES);
        String a = "A";
        String b = "A";
       // System.out.println(a == b);
       // System.out.println(a.equals(b));

        String a1 = "B";
        String b1 = new String("B");

        int t = 200;
        System.out.println((byte) t);

//        Set<Employee> set = new HashSet<>();
//        set.add(emp1);
//        set.add(emp1test);
//        System.out.println(set);


        //System.out.println(a1 == b1);




//        System.out.println(emp1 == emp2);
//        System.out.println(emp1.hashCode());
//        System.out.println(emp2.hashCode());
//
//        System.out.println(emp1.equals(emp2));


//        emp1.m(); //var args
//
//        Employee[] employees = {emp1, emp2, emp3, emp4};
//
//        String str = "MAMA";
//        int f = str.length();
//
//        int y = emp1.getName().length();

    }
}