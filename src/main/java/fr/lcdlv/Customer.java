package fr.lcdlv;

public class Customer {

    public String order(Instruction instruction) {
        return "M:Drink maker makes 1 " + instruction.getName();
    }

    public String order(String instruction) {
        String nbSugar = numberOfSugar(instruction);
      return "M:Drink maker makes 1 tea with " + nbSugar + " sugars and a stick";
    }

    private String numberOfSugar(String instruction) {
        String[] arrOfStr = splitInstruction(instruction);
        return arrOfStr[1];
    }

    private String[] splitInstruction(String instruction) {
        return instruction.split(":");
    }
}
