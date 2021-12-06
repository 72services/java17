package io.seventytwo.edu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Exercise: Replace the multiline strings with text blocks
 */
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
    void noLineBreaks() {
        String html = "<!DOCTYPE html>" +
                "<html>" +
                "    <body>" +
                "" +
                "        <h1>My First Heading</h1>" +
                "" +
                "        <p>My first paragraph.</p>" +
                "" +
                "    </body>" +
                "</html>";

        assertEquals("<!DOCTYPE html><html>    <body>        <h1>My First Heading</h1>        <p>My first paragraph.</p>    </body></html>", html);
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

    /**
     * Exercise: How can you use """ in a text block?
     */
    @Test
    void escaping() {
//        String escape = """
//                """
//                """;
//
//        assertEquals("\"\"\"", escape);
    }

}
