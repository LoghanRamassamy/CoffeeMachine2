package fr.lcdlv;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {
    @Test
    public void customer_instruction_is_T_should_return_tea_message() {
        Customer customer = new Customer();
        assertThat(customer.order("T")).isEqualTo("M:Drink maker makes 1 tea");
    }

    @Test
    public void customer_instruction_is_T_should_return_chocolate_message() {
        Customer customer = new Customer();
        assertThat(customer.order("C")).isEqualTo("M:Drink maker makes 1 chocolate");
    }
}
