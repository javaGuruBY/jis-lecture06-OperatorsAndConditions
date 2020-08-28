package by.jrr.jis4.lecture6.operators;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Miscellaneous {
//    ., instanceof, (), -> []

    @Test
    public void instanceOf() {
        String str = "hello";
        boolean result = str instanceof String;
        assertTrue(result);
    }
    @Test
    public void instanceOfDemo() {
        Object str = new String("hello");
        assertTrue(str instanceof String);
        assertTrue(str instanceof Object);
        assertFalse(str instanceof Miscellaneous);

        List myArrayList = new ArrayList();
        List myLinkedList = new LinkedList();

        assertTrue(myArrayList instanceof Collection);
        assertTrue(myLinkedList instanceof Collection);

        assertTrue(myArrayList instanceof AbstractList);
        assertTrue(myLinkedList instanceof AbstractList);

        assertTrue(myArrayList instanceof Iterable);
        assertTrue(myLinkedList instanceof Iterable);

        assertTrue(myArrayList instanceof List);
        assertTrue(myLinkedList instanceof List);

        assertTrue(myArrayList instanceof ArrayList);
        assertFalse(myLinkedList instanceof ArrayList);
    }

    @Test
    public void safeCastingPositive() {
        String myString = "initial";
        Object objString = "hello";

        if(objString instanceof String) {
            myString = (String) objString;
        }
        assertEquals("hello", myString);
    }

    @Test
    public void safeCastingNagetive() {
        String myString = "initial";
        Object objNonString = 56;

        if(objNonString instanceof String) {
            myString = (String) objNonString;
        }
        assertEquals("initial", myString);
    }
}
