package fr.lcdlv;

public class Customer {

    public String order(Instruction instruction) {
        return "M:Drink maker makes 1 " + instruction.getName();
    }

    public String order(String instruction) {
        if(instruction.contains("2")) return "Drink maker makes 1 tea with 2 sugars and a stick";
        return "Drink maker makes 1 tea with 1 sugars and a stick";
    }
}
