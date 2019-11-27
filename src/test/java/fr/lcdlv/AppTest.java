package fr.lcdlv;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {
    @Test
    public void customer_instruction_is_T_should_return_tea() {
        Customer customer = new Customer();
        assertThat(customer.order("T")).isEqualTo("Tea");
    }
}
