package fr.lcdlv;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {
    @ParameterizedTest
    @CsvSource({"T, M:Drink maker makes 1 tea", "H, M:Drink maker makes 1 chocolate", "C, M:Drink maker makes 1 coffee"})
    public void customer_instruction_is_drink_should_return_drink_message(Instruction instruction, String expected) {
        // Given
        Customer customer = new Customer();

        // When
        String result = customer.order(instruction);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void customer_instruction_is_drink_with_one_sugar_should_return_drink_message_with_sugar() {
        Customer customer = new Customer();

        String result = customer.order("T:1");

        assertThat(result).isEqualTo("Drink maker makes 1 tea with 1 sugars and a stick");
    }

    @Test
    public void customer_instruction_is_drink_with_two_sugar_should_return_drink_message_with_sugar() {
        Customer customer = new Customer();

        String result = customer.order("T:2");

        assertThat(result).isEqualTo("Drink maker makes 1 tea with 2 sugars and a stick");
    }

    @Test
    public void customer_instruction_is_drink_with_three_sugar_should_return_drink_message_with_sugar() {
        Customer customer = new Customer();

        String result = customer.order("T:3");

        assertThat(result).isEqualTo("Drink maker makes 1 tea with 3 sugars and a stick");
    }

}
