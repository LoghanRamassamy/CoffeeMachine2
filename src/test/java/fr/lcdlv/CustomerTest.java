package fr.lcdlv;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {
    @ParameterizedTest
    @CsvSource({
            "T:0:0.4, M:Drink maker makes 1 tea with no sugar and therefore no stick",
            "H:0:0.5, M:Drink maker makes 1 chocolate with no sugar and therefore no stick",
            "C:0:0.6, M:Drink maker makes 1 coffee with no sugar and therefore no stick"
    })
    public void customer_instruction_is_drink_without_sugar_should_return_drink_message_without_sugar(String instruction, String expected) {
        // Given
        Customer customer = new Customer();

        // When
        String result = customer.send(instruction);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({
            "T:1:0.4, M:Drink maker makes 1 tea with 1 sugars and a stick",
            "H:2:0.5, M:Drink maker makes 1 chocolate with 2 sugars and a stick",
            "C:3:0.6, M:Drink maker makes 1 coffee with 3 sugars and a stick"
    })
    public void customer_instruction_is_drink_with_sugar_should_return_drink_message_with_sugar(String instruction, String expected) {
        // Given
        Customer customer = new Customer();

        // When
        String result = customer.send(instruction);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({
            "T:0:0.2, M:Money missing 0.2"
    })
    public void customer_instruction_is_drink_no_enough_money_should_return_drink_message_with_money_missing(String instruction, String expected) {
        // Given
        Customer customer = new Customer();

        // When
        String result = customer.send(instruction);

        // Then
        assertThat(result).isEqualTo(expected);
    }

}
