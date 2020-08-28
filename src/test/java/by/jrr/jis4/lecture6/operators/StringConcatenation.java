package by.jrr.jis4.lecture6.operators;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringConcatenation {
//    +, +=

    @Test
    public void concat() {
        String result = 1 + 2 + "3";
        assertEquals("33", result);
    }

    @Test
    public void concat2() {
        String result = "1" + 2 + 3;
        assertEquals("123", result);
    }

    @Test
    public void concatShort() {
        String result = "1";
        result += "23";
        assertEquals("123", result);
    }
}

