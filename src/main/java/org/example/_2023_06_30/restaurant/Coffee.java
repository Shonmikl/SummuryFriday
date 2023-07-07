package org.example._2023_06_30.restaurant;

public class Coffee {
    private double price;
    private CoffeeType coffeeType;
    private CoffeeVolume coffeeVolume;
}

class Pan {
    private double price;
    private PanType panType;
}

enum CoffeeType {
    AMERICANO,
    CAPPUCCINO,
    ESPRESSO
}

enum CoffeeVolume {
    C200,
    C300,
    C400
}

enum PanType {
    CANDY,
    NON_CANDY;
}