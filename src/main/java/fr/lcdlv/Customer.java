package fr.lcdlv;

public class Customer {
    private String nbSugar;
    private String drinkType;

    public String send(String instruction) {
        splitInstruction(instruction);
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

    private void splitInstruction(String instruction) {
        String[] instructionElements = instruction.split(":");
        drinkType = Drink.getNameOf(instructionElements[0]);
        nbSugar = instructionElements.length <= 1 ? "0" : instructionElements[1];
    }
}
