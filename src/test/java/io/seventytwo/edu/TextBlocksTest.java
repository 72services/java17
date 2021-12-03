package io.seventytwo.edu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextBlocksTest {

    @Test
    void noIndention() {
        String html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "\n" +
                "<h1>My First Heading</h1>\n" +
                "\n" +
                "<p>My first paragraph.</p>\n" +
                "\n" +
                "</body>\n" +
                "</html>";

        assertEquals("<!DOCTYPE html>\n<html>\n<body>\n\n<h1>My First Heading</h1>\n\n<p>My first paragraph.</p>\n\n</body>\n</html>", html);
    }

    @Test
    void indention() {
        String html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "    <body>\n" +
                "\n" +
                "        <h1>My First Heading</h1>\n" +
                "\n" +
                "        <p>My first paragraph.</p>\n" +
                "\n" +
                "    </body>\n" +
                "</html>";

        assertEquals("<!DOCTYPE html>\n<html>\n    <body>\n\n        <h1>My First Heading</h1>\n\n        <p>My first paragraph.</p>\n\n    </body>\n</html>", html);
    }

    @Test
    void trailingSpaces() {
        String html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "    <body>\n" +
                "  \n" +
                "        <h1>My First Heading</h1>\n" +
                "  \n" +
                "        <p>My first paragraph.</p>\n" +
                "  \n" +
                "    </body>\n" +
                "</html>";

        assertEquals("<!DOCTYPE html>\n<html>\n    <body>\n  \n        <h1>My First Heading</h1>\n  \n        <p>My first paragraph.</p>\n  \n    </body>\n</html>", html);
    }

    @Test
    void formatting() {
        String output = String.format("Name: %s\n" +
                "Phone: %s\n" +
                "Address: %s\n" +
                "Salary: $%.2f\n", "Peter Muster", "032 333 11 22", "Bahnhofstrasse 1, Biel", 70_000.00);

        assertEquals("Name: Peter Muster\nPhone: 032 333 11 22\nAddress: Bahnhofstrasse 1, Biel\nSalary: $70000.00\n", output);
    }

}
