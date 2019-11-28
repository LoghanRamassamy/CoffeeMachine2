package fr.lcdlv;

public class Money {
    private final Double value;

    public Money(Double value) {
        this.value = value;
    }

    private Double format(Double value) {
        return (double) Math.round(value * 100) / 100;
    }

    public boolean isBetterThan(Money money) {
        return this.value >= money.value;
    }

    public Double subtract(Money money) {
        return format(this.value - money.value);
    }
}
