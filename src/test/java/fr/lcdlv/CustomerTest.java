package fr.lcdlv;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {
    @ParameterizedTest
    @CsvSource({"T, M:Drink maker makes 1 tea", "H, M:Drink maker makes 1 chocolate", "C, M:Drink maker makes 1 coffee"})
    public void customer_instruction_is_drink_should_return_drink_message2(Instruction instruction, String expected) {
        // Given
        Customer customer = new Customer();

        // When
        String result = customer.order(instruction);

        // Then
        assertThat(result).isEqualTo(expected);
    }

}
