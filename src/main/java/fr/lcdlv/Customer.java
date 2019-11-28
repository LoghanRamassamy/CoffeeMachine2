package fr.lcdlv;

public class Customer {

    public String order(String instruction) {
        String nbSugar = numberOfSugar(instruction);
        String drinkType = getDrinkType(instruction);
        String result = "M:Drink maker makes 1 " + drinkType;
        result += concatSugar(nbSugar);
        return result;
    }

    private String concatSugar(String nbSugar) {
        if (hasSugar(nbSugar)) return " with no sugar and therefore no stick";
        return " with " + nbSugar  + " sugars and a stick";
    }

    private boolean hasSugar(String nbSugar) {
        return "0".equals(nbSugar);
    }

    private String numberOfSugar(String instruction) {
        String[] instructionElements = splitInstruction(instruction);
        return instructionElements.length <= 1 ? "0" : instructionElements[1];
    }

    private String getDrinkType(String instruction) {
        String[] instructionElements = splitInstruction(instruction);
        String type = instructionElements[0];
        return DrinkType.valueOf(type).getName();
    }

    private String[] splitInstruction(String instruction) {
        return instruction.split(":");
    }
}
