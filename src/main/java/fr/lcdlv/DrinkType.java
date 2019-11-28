package fr.lcdlv;

public enum DrinkType {
    T("tea"),
    H("chocolate"),
    C("coffee");

    private final String name;

    DrinkType(String name) {
        this.name = name;
    }

    public static String getNameOf(String type) {
        return valueOf(type).name;
    }
}
