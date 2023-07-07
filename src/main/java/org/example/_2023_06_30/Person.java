package org.example._2023_06_30;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.lang.ref.SoftReference;

@Getter
@AllArgsConstructor
public class Person {
    private String name;
    private Card card;
}

@Getter
@AllArgsConstructor
class Card {
    private String name;
    private int number;
    private CurrencyType currencyType;
}

enum CurrencyType {
    USD,
    RUR,
    EUR,
    PLN;
}

class Main {
    public static void check(Person person) {
        if(person.getCard().getCurrencyType() == CurrencyType.USD) {
            System.out.println("***");
        }
    }
}