package org.example._2023_06_09;

import java.util.Objects;

public class Ex345 extends Object {

    String name;

    @Override
    public String toString() {
        return "Ex345: [" + name + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ex345 ex345)) return false;
        return Objects.equals(name, ex345.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {
        System.out.println(new Ex345());
    }
}
