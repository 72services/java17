package io.seventytwo.edu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwitchExpressionsTest {

    /**
     * Exercise 1: Replace the switch statement with a switch expression
     */
    @Test
    void switchExpression() {
        int numberOfLetters = getNumberOfLetters(Day.WEDNESDAY);

        assertEquals(9, numberOfLetters);
    }

    private int getNumberOfLetters(Day day) {
        switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                return 6;
            case TUESDAY:
                return 7;
            case THURSDAY:
            case SATURDAY:
                return 8;
            case WEDNESDAY:
                return 9;
            default:
                throw new IllegalStateException("Invalid day: " + day);
        }
    }

    /**
     * Exercise 2: Create the same switch expression as in exercise 1 but this time with {} and yield
     * Bonus: Try to remove a yield statement and check what happens
     */
    @Test
    void switchExpressionWithYield() {

    }

    /**
     * Exercise 3: Replace the if statement with a switch expression
     */
    @Test
    void patternMatching() {
        assertEquals("null", getType(null));
        assertEquals("String is Hello", getType("Hello"));
        assertEquals("else", getType(Integer.valueOf("1")));
    }

    private String getType(Object object) {
        if (object == null) {
            return "null";
        } else if (object instanceof String) {
            String value = (String) object;
            return "String is " + value;
        } else {
            return "else";
        }
    }

}
