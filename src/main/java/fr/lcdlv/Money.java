package fr.lcdlv;

import java.text.DecimalFormat;

public class Money {
    private final Double value;

    public Money(Double value) {
        this.value = (double)Math.round(value * 100) / 100; //value; // format(value);
    }

    private Double format(Double value) {
        return (double)Math.round(value * 100) / 100;
    }

    public boolean isBetterThan(Money money) {
        return this.value >= money.value;
    }

    public Double subtract(Money money) {
        return format(this.value - money.value);
    }
}
