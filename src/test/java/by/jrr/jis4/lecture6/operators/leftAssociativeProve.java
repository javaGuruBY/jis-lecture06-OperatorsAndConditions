package by.jrr.jis4.lecture6.operators;

import org.junit.Assert;
import org.junit.Test;

public class leftAssociativeProve {

    @Test
    public void test() {
        int result = 2 - 3 + 4;
        Assert.assertEquals(3, result);
    }

    @Test
    public void test1() {
                    // --->>>
        int result = 2 - (3 + 4);
        Assert.assertEquals(-5, result);
    }

    @Test
    public void test2() {
        int a = 1;
        int b = 2;
        int c = 3;
                    // <<<---
        int result = a = b = c;
        Assert.assertEquals(3, result);
        Assert.assertEquals(3, a);
        Assert.assertEquals(3, b);
    }
}
