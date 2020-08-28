package by.jrr.jis4.lecture6.decisions;

import org.junit.Assert;
import org.junit.Test;

public class SwitchCase {

    @Test
    public void basics() {
        int i = returnInt();
        String message = null;
        switch (i) {
            case 0:
                message = "i is zero";
                break;
            case 1:
                message = "i is one";
                break;
            default:
                message = "i nether zero nor one";
                break;
        }
    }

    private int returnInt() {
        return 1;
    }

    @Test
    public void realWorldEx() {
        int i = returnInt();
        String message = null;
        if (i == 0) {
            message = "i is zero";
        } else if (i == 1) {
            message = "i is one";
        } else {
            message = "i nether zero nor one";
        }
    }

    @Test
    public void fallThroughBehavior1() {
        char i = returnCharValve();
        String message = "some text";
        switch (i) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                message += " and valve";
            default:
                message = message.toUpperCase();

        }
        Assert.assertEquals("SOME TEXT AND VALVE", message);
    }

    @Test
    public void fallThroughBehavior2() {
        char i = returnCharNotValve();
        String message = "some text";
        switch (i) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                message += " and valve";
            default:
                message = message.toUpperCase();
        }
        Assert.assertEquals("SOME TEXT", message);
    }
    @Test
    public void fallThroughBehavior3() {
        char i = returnCharNotValve();
        String message = "some text";
        switch (i) {
            default:
                message = message.toUpperCase();
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                message += " and valve";

        }
        Assert.assertEquals("SOME TEXT and valve", message);
    }

    private char returnCharValve() {
        return 'o';
    }

    private char returnCharNotValve() {
        return 'l';
    }

    @Test
    public void validSyntax() {
        int i = 0;
        switch (i) {
            default: i = i + 3;
            case 2 : i = i + 2;
            case 0 : break;
            case 1 : i = i + 1; break;
            case 3 : i = i + 3;
        }
    }


}
