package io.seventytwo.edu;

import io.seventytwo.edu.animal.Cat;
import io.seventytwo.edu.animal.Dog;
import io.seventytwo.edu.animal.Pet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatternMatchingTest {

    public static Stream<Pet> animals() {
        return Stream.of(new Cat(), new Dog());
    }

    /**
     * Exercise 1: Remove unnecessary cast
     */
    @ParameterizedTest
    @MethodSource("animals")
    public void instanceOf(Object obj) {
        if (obj instanceof Dog dog) {
            assertEquals("Wuff", dog.bark());
        } else if (obj instanceof Cat cat) {
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
        return switch (object) {
            case null -> "null";
            case String value -> "String is " + value;
            default -> "else";
        };
    }
}
