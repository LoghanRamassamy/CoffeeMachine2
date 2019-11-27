package fr.lcdlv;

public enum Instruction {
    T("tea"),
    H("chocolate"),
    C("coffee");

    private final String name;

    Instruction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
