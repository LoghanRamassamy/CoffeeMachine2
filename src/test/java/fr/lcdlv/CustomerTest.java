package fr.lcdlv;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {
    @ParameterizedTest
    @CsvSource({
            "T, M:Drink maker makes 1 tea",
            "H, M:Drink maker makes 1 chocolate",
            "C, M:Drink maker makes 1 coffee"
    })
    public void customer_instruction_is_drink_should_return_drink_message(Instruction instruction, String expected) {
        // Given
        Customer customer = new Customer();

        // When
        String result = customer.order(instruction);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({
            "T:1, M:Drink maker makes 1 tea with 1 sugars and a stick",
            "T:2, M:Drink maker makes 1 tea with 2 sugars and a stick",
            "C:3, M:Drink maker makes 1 tea with 3 sugars and a stick"
    })
    public void customer_instruction_is_drink_with_one_sugar_should_return_drink_message_with_sugar(String instruction, String expected) {
        Customer customer = new Customer();

        String result = customer.order(instruction);

        assertThat(result).isEqualTo(expected);
    }

}
