package fr.lcdlv;

public class Customer {
    private String nbSugar;
    private String drinkType;
    private String nbMoney;

    public String send(String instruction) {
        splitInstruction(instruction);
        if("0.4".equals(nbMoney) ) return generateMessage();
        return generateMessage();
    }

    private String generateMessage() {
        return "M:Drink maker makes 1 " + drinkType + concatSugar(nbSugar);
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
        nbMoney = instructionElements.length <= 1 ? "0" : instructionElements[2];
    }
}
