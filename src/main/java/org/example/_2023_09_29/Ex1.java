package org.example._2023_09_29;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ex1 {
    public int get(int a) {
        return 10 / a;
    }

    public int doSum(int a) {
        return a * get(a); //a * 12?
    }
}

class Ex1Test {
    private static final Ex1 ex = new Ex1();

    @Test
    @Description("public int get(int a) test ")
    void getTestPositive() {
        Assertions.assertEquals(5, ex.get(2));
    }

    @Test
    void getTestWithException() {
        Assertions.assertThrows(ArithmeticException.class, ()-> ex.get(0));
    }
}