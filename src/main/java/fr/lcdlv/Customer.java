package fr.lcdlv;

public class Customer {

    public String order(Instruction instruction) {
        return "M:Drink maker makes 1 " + instruction.getName();
    }
}
