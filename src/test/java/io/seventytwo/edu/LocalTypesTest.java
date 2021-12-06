package io.seventytwo.edu;

import io.seventytwo.edu.calendar.Day;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Exercise: Write a method that either uses a local record, enum or interface
 */
public class LocalTypesTest {

    @Test
    void localRecord() {
        record DayWithNumberOfLetters(Day day, int numberOfLetters) {
        }

        List<Day> days = Arrays.stream(Day.values())
                .map(day -> new DayWithNumberOfLetters(day, day.name().length()))
                .filter(dayWithNumberOfLetters -> dayWithNumberOfLetters.numberOfLetters > 7)
                .map(dayWithNumberOfLetters -> dayWithNumberOfLetters.day)
                .toList();

        assertEquals(3, days.size());
    }
}
