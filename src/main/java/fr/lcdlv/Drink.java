package fr.lcdlv;

public enum Drink {
    T("tea", 0.4),
    H("chocolate", 0.5),
    C("coffee", 0.6);

    private final String name;
    private final Double cost;

    Drink(String name) {
        this.name = name;
        this.cost = 0.0;
    }

    Drink(String name, Double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public Double getCost() {
        return cost;
    }
}
