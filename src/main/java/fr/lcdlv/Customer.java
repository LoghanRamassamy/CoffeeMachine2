package fr.lcdlv;

public class Customer {
    public String order(String instruction) {
        if(instruction == "C") return "M:Drink maker makes 1 chocolate";
        return "M:Drink maker makes 1 tea";
    }
}
