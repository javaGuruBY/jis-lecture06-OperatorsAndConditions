package by.jrr.jis4.lecture6.decisions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ternanry {

    @Test
    public void basics() {
//        operand 1 ? operand 2 : operand 3;
        if (true) {
            System.out.println("if true, do this");
        } else {
            System.out.println("if false, do this");
        }

        String result = true ? "if true, return this string" : "if false, return this string";
//        below won't compile
//        String result = true ? System.out.println("if true, do this") : System.out.println("if false, do this");
        String result2 = true ? doThisAndReturn() : doThisAndReturn(); // smells
//        String result3 = true ? doThisAndVoid() : doThisAndVoid(); // won't compile
    }

    private String doThisAndReturn() {
        return "someString";
    }

    private void doThisAndVoid() {
    }

    @Test
    public void quiz() {
        int x = 0;
        int y = 1;
        int result = x > y ? ++x : y++;
        assertEquals(0, x);
        assertEquals(2, y);

        assertEquals(1, result);
    }

    @Test
    public void realWordExample() {
        int x = 0;
        boolean flag = true;
        if (flag) {
            x = 5;
        } else {
            x = 78;
        }

        int k = flag ? 5 : 78;
    }
}
