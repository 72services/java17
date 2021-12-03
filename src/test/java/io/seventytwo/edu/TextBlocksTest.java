package io.seventytwo.edu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

        Assertions.assertEquals("<!DOCTYPE html>\n<html>\n<body>\n\n<h1>My First Heading</h1>\n\n<p>My first paragraph.</p>\n\n</body>\n</html>", html);
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

        Assertions.assertEquals("<!DOCTYPE html>\n<html>\n    <body>\n\n        <h1>My First Heading</h1>\n\n        <p>My first paragraph.</p>\n\n    </body>\n</html>", html);
    }

    @Test
    void trailingSpaces() {
        String html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "    <body>\n" +
                "  \n" +
                "        <h1>My First Heading</h1>\n"+
                "  \n" +
                "        <p>My first paragraph.</p>\n" +
                "  \n" +
                "    </body>\n" +
                "</html>";

        Assertions.assertEquals("<!DOCTYPE html>\n<html>\n    <body>\n  \n        <h1>My First Heading</h1>\n  \n        <p>My first paragraph.</p>\n  \n    </body>\n</html>", html);
    }

}
