package fr.lcdlv;

public enum Drink {
    T("tea", new Money(0.4)),
    Th("extra hot tea", new Money(0.4)),
    H("chocolate", new Money(0.5)),
    Hh("extra hot chocolate", new Money(0.5)),
    C("coffee", new Money(0.6)),
    Ch("extra hot coffee", new Money(0.6)),
    O("orange juice", new Money(0.6));

    private final String name;
    private final Money cost;

    Drink(String name, Money cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public Money getCost() {
        return cost;
    }
}
