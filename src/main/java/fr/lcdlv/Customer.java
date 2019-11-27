package fr.lcdlv;

public class Customer {

    public String order(Instruction instruction) {
        return "M:Drink maker makes 1 " + instruction.getName();
    }

    public String order(String instruction) {
        String nbSugar = numberOfSugar(instruction);
        String drinkType = drinkType(instruction);
      return "M:Drink maker makes 1 " + Instruction.valueOf(drinkType).getName() + " with " + nbSugar + " sugars and a stick";
    }

    private String numberOfSugar(String instruction) {
        String[] arrOfStr = splitInstruction(instruction);
        return arrOfStr[1];
    }

    private String drinkType(String instruction) {
        String[] arrOfStr = splitInstruction(instruction);
        return arrOfStr[0];
    }

    private String[] splitInstruction(String instruction) {
        return instruction.split(":");
    }
}
