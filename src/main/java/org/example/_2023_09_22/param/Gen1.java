package org.example._2023_09_22.param;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Gen1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //List list = new ArrayList();
        //(String) list.get(0);

        Faker faker = new Faker();
        System.out.println(faker.name().username());
    }
}