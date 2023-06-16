package org.example._2023_06_16;

public class Animal extends Object {
    public void m1() {
    }

    public static void main(String[] args) {
        Animal animal = new Cat();
        Animal animal1 = new Dog();
        Cat cat = new Cat();

       // Object o = new Person();
        Object o1 = new Animal();
        Object o2 = new Cat();
    }
}

class Cat extends Animal{}
class Dog extends Animal{}
