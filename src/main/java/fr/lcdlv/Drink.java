package fr.lcdlv;

public enum Drink {
    T("tea", "0.4"),
    H("chocolate", "0.5"),
    C("coffee", "0.6");

    private final String name;
    private final String cost;

    Drink(String name) {
        this.name = name;
        this.cost = "0";
    }

    Drink(String name, String cost) {
        this.name = name;
        this.cost = cost;
    }

    public static String getNameOf(String drinkType) {
        return valueOf(drinkType).name;
    }
}
