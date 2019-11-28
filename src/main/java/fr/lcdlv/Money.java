package fr.lcdlv;

public class Money {
    private final Double value;

    public Money(Double value) {
        this.value = value;
    }

    public boolean isBetterThan(Money money) {
        return this.value >= money.value;
    }

    public Double subtract(Money money) {
        return  this.value - money.value;
    }
}
