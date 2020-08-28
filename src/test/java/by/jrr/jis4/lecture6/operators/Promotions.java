package by.jrr.jis4.lecture6.operators;

import org.junit.Test;

import static org.junit.Assert.*;

public class Promotions {

    @Test
    public void test1() {
        int i = 10;
        double dbl = 2.5;
        double result = i * dbl;
    }

    @Test
    public void test2() {
        byte i = 10;
//        short s = -i; //won't compile
        int s = -i;
    }

    @Test
    public void errors() {
        short s1 = 1;
        byte b1 = 1;
        byte b2 = 2;

//        short s2 = +s1; //result will be an int
//        byte b =  s1 + 2; //result will be an int
//        s2 = s1 * 1; //the result will be an int
//
//        float f = 1.0f; //to write a float literal you have to append it with an f or an F
//        double d = 1.0;
//        int x = f - 1; //result will be a float
//        float f2 = f + d; //result will be a double
    }
}
