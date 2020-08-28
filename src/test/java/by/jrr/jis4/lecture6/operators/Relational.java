package by.jrr.jis4.lecture6.operators;

import org.junit.Test;

import static org.junit.Assert.*;

public class Relational {
    // <, >, <=, >=
    // ==, != (for reference compares references!!!)
    //returns boolean

    @Test
    public void qtlt() {
        int i = 5;
        double b = 6.0;

        boolean result = i < b;
        assertTrue(result);
    }

    @Test
    public void equalWithPrimitive() {
        int i = 5;
        double b = 5.0;

        boolean result = i == b;
        assertTrue(result);
    }
    @Test
    public void equalWithReferenceCache() {
        Integer i = 5;
        Integer b = 5;

        boolean result = i == b;
        assertTrue(result);
    }
    @Test
    public void equalWithReferenceNonCache() {
        Integer i = 130;
        Integer b = 130;

        boolean result = i == b;
        assertFalse(result);
        assertTrue(i.equals(b));
    }

    @Test
    public void equalWithNullWrapperShouldThrowNPE() {
        Integer i = null;
        int b = 130;

        boolean result = b == i;
//        i.intValue() == b;
    }
    @Test
    public void equalWithReferenceNonCacheForShort() {
        Short i = 130;
        Short b = 130;

        boolean result = i == b;
        assertFalse(result);
        assertTrue(i.equals(b));
    }
}
