package fr.lcdlv;

public enum Drink {
    T("tea"),
    H("chocolate"),
    C("coffee");

    private final String name;

    Drink(String name) {
        this.name = name;
    }

    public static String getNameOf(String drinkType) {
        return valueOf(drinkType).name;
    }
}
