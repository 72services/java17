package io.seventytwo.edu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NullPointerExceptionTest {

    @Test
    void helpfulMessage() {
        String name = null;
        var nullPointerException = Assertions.assertThrows(NullPointerException.class, () -> System.out.println(name.toLowerCase()));

        assertEquals("Cannot invoke \"String.toLowerCase()\" because \"name\" is null", nullPointerException.getMessage());
    }
}
