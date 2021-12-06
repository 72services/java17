package io.seventytwo.edu;

import io.seventytwo.edu.animal.Capricorn;
import io.seventytwo.edu.animal.Pet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SealedClassesTest {

    /**
     * Exercise: A capricorn (Steinbock) is not a pet!
     * Seal the class pet and only allow cats and dogs
     * Fix the assertion
     */
    @Test
    void noPet() {
        Capricorn capricorn = new Capricorn();

        assertTrue(capricorn instanceof Pet);
    }
}
