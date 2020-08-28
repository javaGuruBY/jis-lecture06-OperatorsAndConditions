package by.jrr.jis4.lecture6.operators;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Assignment {
//    = , *= , /= , %= , += , -= , // bitwise <<= , >>= , >>>= , &= , ^= , and, |=
    // = Simple assignment
    // others - Compound assignment

    @Test
    public void compoundAssignment() {
        int i;
//        i += i;
//        i += i + i;

        i = 5;
        assertEquals(10, i += i);
        i = 5;
        assertEquals(0, i -= i);
        i = 5;
        assertEquals(25, i *= i);
        i = 5;
        assertEquals(1, i /= i);
        i = 5;
        assertEquals(0, i %= i);
    }
}
