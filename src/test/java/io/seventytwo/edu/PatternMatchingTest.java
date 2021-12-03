package io.seventytwo.edu;

import io.seventytwo.edu.animal.Cat;
import io.seventytwo.edu.animal.Dog;
import org.junit.jupiter.api.Test;

public class PatternMatchingTest {

    @Test
    public void instanceOf() {
        Object obj = new Dog();

        if (obj instanceof Dog) {
            Dog dog = (Dog) obj;

            System.out.println(dog.bark());
        } else if (obj instanceof Cat) {
            Cat cat = (Cat) obj;

            System.out.println(cat.meow());
        }
    }
}
