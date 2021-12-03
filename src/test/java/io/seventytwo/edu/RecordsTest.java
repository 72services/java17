package io.seventytwo.edu;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Exercise 1: Change the type of PersonDTO to record
 */
class RecordsTest {

    @Test
    void constructor() {
        var record = new PersonDTO("Peter", "Muster");

        assertEquals("Peter", record.firstName());
        assertEquals("Muster", record.lastName());
    }

    @Test
    void equalsMixedCase() {
        var record1 = new PersonDTO("Peter", "Muster");
        var record2 = new PersonDTO("Peter", "Muster");

        assertEquals(record1, record2);
    }

    /**
     * Exercise 2: Overwrite the constructor and make first and last name uppercase
     */
    @Test
    @Disabled
    void equalsUpperCase() {
        var record = new PersonDTO("Peter", "Muster");

        assertEquals("PETER", record.firstName());
        assertEquals("MUSTER", record.lastName());
    }
}
