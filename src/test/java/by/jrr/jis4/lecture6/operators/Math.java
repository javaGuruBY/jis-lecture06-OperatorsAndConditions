package by.jrr.jis4.lecture6.operators;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Math {
    // +, *, /, -, %

    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;

    @Before
    public void setup() {
        b = 3;
        s = 3;
        i = 3;
        l = 3;
        f = 3F;
        d = 3;
    }

    @Test
    public void additionsOfDifferentTypesReturnsInt() {
        int result = b + s;
    }

    @Test
    public void multOfDifferentTypesReturnsInt() {
        int result = i * i;
    }

    @Test
    public void divOfDifferentTypesReturnsInt() {
        int result = b / i;
        assertEquals(1, result);
        float result2 = b / f;
        assertEquals(1.0, result2, 0);
        double result3 = b / d;
        assertEquals(1.0, result3, 0);

        d = 5;

        double result01 = d / i;
        assertEquals(1.66, result01, 0.01);
        double result02 = d / f;
        assertEquals(1.66, result02, 0.01);
        double result03 = d / d;
        assertEquals(1.0, result03, 0.01);

    }

    //Casting and promotion
    @Test
    public void divCastingInt() {
        int a = 5;
        int b = 2;
        int divResult = a / b;
        System.out.println("divResult = " + divResult);
    }

    @Test
    public void divHiddenCastingDouble() {
        int a = 5;
        int b = 2;
        double divResult = a / b; // int 2 is cast to double 2.0
        System.out.println("divResult = " + divResult);
    }

    @Test
    public void divCastingDouble() {
        int a = 5;
        int b = 2;
        double divResult = (double) (a / b); // int 2 is cast to double 2.0
        System.out.println("divResult = " + divResult);
    }

    @Test
    public void divCastingDoubleForce() {
        int a = 5;
        int b = 2;
        double divResult = (double) a / b; // a cast to double, => b cast to double, result 2.5
        System.out.println("divResult1= " + divResult);
    }
}
