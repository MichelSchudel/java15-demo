package nl.craftsmen.java15demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PatternMatchingTest {

    @Test
    public void test_pattern_matching_instance_of() {
        exec("hello!");
    }

    private void exec(Object object) {
        if (object instanceof String s) {
            assertThat(s.toUpperCase()).isEqualTo("HELLO!");
        }

    }
}
