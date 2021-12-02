package io.seventytwo.edu;

public class Examples {

    public static void main(String[] args) {
        var personDTO = new PersonDTO("Peter", "Muster");

        print("Record", personDTO.toString());

        print("Textblock", textblocks());

        print("SwitchExpression", switchExpressions(Color.RED));

        print("PatternMatchingInstanceOf", patternMatchingInstanceOf(personDTO));

        nullPointer(null);
    }

    public static String textblocks() {
        return "select * " +
                "from person " +
                "where name = 'Peter' " +
                "order by name";
    }

    public static String switchExpressions(Color color) {
        switch (color) {
            case RED:
                return "red";
            case BLUE:
                return "blue";
            case GREEN:
                return "green";
            default:
                return "black";
        }
    }

    public enum Color {
        RED, BLUE, GREEN
    }

    public static String patternMatchingInstanceOf(Object obj) {
        if (obj instanceof PersonDTO) {
            var personDTO = (PersonDTO) obj;
            return personDTO.toString();
        }
        return "";
    }

    private static void nullPointer(String name) {
        if (name.equals("Simon")) {

        }
    }

    private static void print(String information, String text) {
        System.out.printf("%1$-25s: %2$s\n\n", information, text);
    }

}
