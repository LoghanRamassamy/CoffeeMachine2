package fr.lcdlv;

public class Customer {
    public String order(String instruction) {
        if("C".equals(instruction)) return "M:Drink maker makes 1 coffee";
        if("H".equals(instruction)) return "M:Drink maker makes 1 chocolate";
        return "M:Drink maker makes 1 tea";
    }
}
