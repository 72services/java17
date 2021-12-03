package io.seventytwo.edu;

import io.seventytwo.edu.animal.Capricorn;
import io.seventytwo.edu.animal.Pet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SealedClassesTest {

    /**
     * Exercise: A capricorn (Steinbock) is not a pet!
     * Seal the class pet and only allow cats and dogs
     */
    @Test
    void noPet() {
        Capricorn capricorn = new Capricorn();

        Assertions.assertTrue(capricorn instanceof Pet);
    }
}
