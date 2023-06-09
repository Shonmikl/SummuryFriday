package org.example._2023_06_09;

public class Emp {
    String name;
    AccessLevel accessLevel;

    public Emp(String name, AccessLevel accessLevel) {
        this.name = name;
        this.accessLevel = accessLevel;
    }

    public static void main(String[] args) {
        Emp e1 = new Emp("Ivan", AccessLevel.A);
        Emp e2 = new Emp("Petr", AccessLevel.B);
        Emp e3 = new Emp("Oxana", AccessLevel.C);

        Emp[] emps = {e1, e2, e3};

        for (int i = 0; i < emps.length; i++) {
            if(emps[i].accessLevel == AccessLevel.A) {
                System.out.println("");
            }
        }
    }
}

enum AccessLevel {
    A,
    B,
    C,
    USD
}
