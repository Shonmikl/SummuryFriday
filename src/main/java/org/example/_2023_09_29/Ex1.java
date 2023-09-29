package org.example._2023_09_29;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

public class Ex1 {
    public int get(int a) {
        return 10 / a;
    }

    public int doSum(int a, Ex1 o) {
        return a * o.get(a); //a * 12?
    }
}

@ExtendWith(MockitoExtension.class)
class Ex1Test {
    private static final Ex1 realObject = new Ex1();

    @Mock
    Ex1 mockObject;

    @Test
    @Description("doSum() with Mock test")
    void doSumTest() {
        int a = 10;
        int expected = 50;
        Mockito.when(mockObject.get(a)).thenReturn(5);
        Assertions.assertEquals(expected, realObject.doSum(a, mockObject));
        Mockito.verify(mockObject).get(a);
    }

    @Test
    @Description("public int get(int a) test ")
    void getTestPositive() {
        Assertions.assertEquals(5, realObject.get(2));
    }

    @Test
    void getTestWithException() {
        Assertions.assertThrows(ArithmeticException.class, ()-> realObject.get(0));
    }
}