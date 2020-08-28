package by.jrr.jis4.lecture6.decisions;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IfElse {

    @Test
    public void basics() {
        if (true) {
            // do something
        } else {
            // do another thing
        }
    }

    @Test
    public void ifFirstIsTrueNonOtherExecuted() {
        boolean first = true;
        boolean second = true;
        String result = "initial";

        if (first) {
            result = "first";
        } else if (second) {
            result = "second";
        } else {
            result = "default";
        }

        assertEquals("first", result);
    }

    @Test
    public void ifFirstTrueExecuted() {
        boolean first = false;
        boolean second = true;
        String result = "initial";

        if (first) {
            result = "first";
        } else if (second) {
            result = "second";
        } else {
            result = "default";
        }

        assertEquals("second", result);
    }

    @Test
    public void ifNothingTrueThatElseExecuted() {
        boolean first = false;
        boolean second = false;
        String result = "initial";

        if (first) {
            result = "first";
        } else if (second) {
            result = "second";
        } else {
            result = "default";
        }

        assertEquals("default", result);
    }

    @Test
    public void ifNothingTrueThatNothingExecuted() {
        boolean first = false;
        boolean second = false;
        String result = "initial";

        if (first) {
            result = "first";
        } else if (second) {
            result = "second";
        }

        assertEquals("initial", result);
    }

    @Test
    public void shortNotations() {
        boolean first = false;
        boolean second = false;
        String result = "initial";
        if (first) {
            result = "first";
        } else if (second) {
            result = "second";
        }
        if (first) result = "first";
        else result = "second";
        if (first) result = "first";
        else if (second) result = "second";
        else result = "default";

        if (first) ;
        else ;
        if (first) ;
        if (first) ;
        else System.out.println("hello");
        if (first) System.out.println("hello");
        else ;

        if (first) ;
        else System.out.println("hello");
    }

    @Test
    public void assignment() {
        boolean first = false;
        String result = "initial";
        if (first = true) {
            result = "first";
        }
        assertEquals("first", result);
    }

    @Test // дикая дикость, не делайте так
    public void conditionAssignmentBad() {
        String result = null;
        if ((result = getName()) != null) {
            result = "first";
        }
        assertEquals("first", result);
    }

    @Test // делайте так
    public void conditionAssignmentFine() {
        String result = getName();
        if (result != null) {
            result = "first";
        }
        assertEquals("first", result);
    }

    private String getName() {
        return "someString";
    }

    @Test
    public void goodStyle() {
        //smells
        boolean flag = false;
        if (flag) {
            //do nothing
        } else {
            // do stuff
        }

        // use negation
        if (!flag) {
            //do stuff
        }
    }

    @Test
    public void goodPractice() {
        int age = 35;
        if (isWorkingAge(age)) {
            // do some work
        }
    }

    private boolean isWorkingAge(int age) {
        if (age > 16 && age < 60) return true;
        return false;
    }

    @Test
    public void practice() {
        int age = 35;
        if (age > 18) {
            // do some work
        } else if (age < 60) {
            // never executed
        }
    }
}

