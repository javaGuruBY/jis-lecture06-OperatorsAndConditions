package by.jrr.jis4.lecture6.operators;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class Unary {
//     -, +, --, ++;

    @Test
    public void unaryMinusReturnsNegated() {
        int i = 10;
        int result = -i;
        assertEquals(-10, result);
        assertEquals(10, i);

        i = -10;
        result = -i;
        assertEquals(10, result);
        assertEquals(-10, i);
    }
    @Test
    public void unaryPlus() {
        int i = 10;
        int result = +i;
        assertEquals(10, result);
        assertEquals(10, i);

        i = -10;
        result = +i;
        assertEquals(-10, result);
        assertEquals(-10, i);
    }

    @Test
    public void unaryPreIncrement() {
        int i = 10;
        assertEquals(11, ++i);
        assertEquals(11, i);
    }
    @Test
    public void unaryPostIncrement() {
        int i = 10;
        assertEquals(10, i++);
        assertEquals(11, i);
    }

    @Test
    public void quiz() {
        int i = 1;
        i = i++;
        assertEquals(1, i);
    }
    @Test
    public void quizCheat() {
        int i = 1;
        int b = i++;
        assertEquals(2, i);
        assertEquals(1, b);
    }
}
