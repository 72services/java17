package io.seventytwo.edu;

import io.seventytwo.edu.animal.Cat;
import io.seventytwo.edu.animal.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatternMatchingTest {

    /**
     * Exercise 1: Remove unnecessary cast
     */
    @Test
    public void instanceOf() {
        Object obj = new Dog();

        if (obj instanceof Dog) {
            Dog dog = (Dog) obj;

            assertEquals("Wuff", dog.bark());
            System.out.println(dog.bark());
        } else if (obj instanceof Cat) {
            Cat cat = (Cat) obj;

            assertEquals("Miau", cat.meow());
        }
    }

    /**
     * Exercise 2: Replace the if statement with a switch expression
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
