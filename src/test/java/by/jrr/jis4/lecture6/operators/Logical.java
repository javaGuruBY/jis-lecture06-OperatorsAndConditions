package by.jrr.jis4.lecture6.operators;

import org.junit.Test;

import static org.junit.Assert.*;

public class Logical {
//    &&, || Short circuiting "and" and "or".
//    &, |;  Non-Short circuiting "and" and "or"
//    ^ Xor
//    ! Negation
//    :?  Ternary

    @Test
    public void shortCircuitingAnd() {
        boolean result = false;

        result = true && true;
        assertTrue(result);

        result = false && false;
        assertFalse(result);

        result = false && true;
        assertFalse(result);

        result = true && false;
        assertFalse(result);
    }

    @Test
    public void shortCircuitingOr() {
        boolean result = false;

        result = true || true;
        assertTrue(result);

        result = false || false;
        assertFalse(result);

        result = false || true;
        assertTrue(result);

        result = true || false;
        assertTrue(result);
    }

    @Test
    public void nonShortCircuitingDemo() {
        boolean result = false;
        Integer i = null;

        result = true || i == 5;
        assertTrue(result);
        result = true | i == 5; //throws NPE
    }

    @Test
    public void negation() {
        boolean initialValue = false;
        boolean result = !initialValue;

        assertTrue(result);
        assertFalse(initialValue);
    }

    @Test
    public void ternaryPlain() {
        String resultLeft = (true) ? ("left") : ("right");
        String resultRight = (false) ? ("left") : ("right");

        assertEquals("left", resultLeft);
        assertEquals("right", resultRight);

    }
    @Test
    public void ternary() {
        int i = 10;
        boolean result = i == 10 ? true : false;
        String resultLeft = i == 10 ? "left" : "right";
        String resultRight = i != 10 ? "left" : "right";

        assertEquals("left", resultLeft);
        assertEquals("right", resultRight);
    }

    @Test
    public void xOr() {
        boolean result = false;

        result = true ^ true;
        assertFalse(result);

        result = false ^ false;
        assertFalse(result);

        result = false ^ true;
        assertTrue(result);

        result = true ^ false;
        assertTrue(result);
    }
}
