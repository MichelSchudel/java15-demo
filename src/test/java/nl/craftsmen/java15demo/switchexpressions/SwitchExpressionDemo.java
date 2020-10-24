package nl.craftsmen.java15demo.switchexpressions;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SwitchExpressionDemo {

    @Test
    public void switchExpressions() {
        assertThat(switchExpression("hi")).isEqualTo("hiResponse");
        assertThat(switchExpression("hiStart")).isEqualTo("startsWithH");
        assertThat(switchExpression("noStart")).isEqualTo("doesNotStartWitH");
    }

    private String switchExpression(String input) {
        String result = switch (input) {
            case "hi" -> "hiResponse";
            default -> {
                if (input.startsWith("h")) {
                    yield "startsWithH";
                } else {
                    yield "doesNotStartWitH";
                }
            }
        };
        return result;

    }

    @Test
    public void enum_test(){
        UserType userType = UserType.RETAIL;

        String result = switch (userType) {
            case RETAIL -> "retail";
            case BUSINESS -> "business";
        };

        System.out.println(result);
    }
}
