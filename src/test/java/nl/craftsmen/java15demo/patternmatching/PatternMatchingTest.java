package nl.craftsmen.java15demo.patternmatching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PatternMatchingTest {

    @Test
    public void test_pattern_matching_instance_of() {
        Object text = "hello!";
        if (text instanceof String s) {
            System.out.println(s.toUpperCase());
        }
    }

}
