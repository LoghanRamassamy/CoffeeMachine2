package fr.lcdlv;

public class Customer {
    private String nbSugar;
    private Drink drink;
    private Double nbMoney;

    public String send(String instruction) {
        splitInstruction(instruction);
        return generateMessage();
    }

    private String generateMessage() {
        if (isEnoughMoney()) return "M:Drink maker makes 1 " + drink.getName() + concatSugar(nbSugar);
        return "M:Money missing " + calculateMissingMoney();
    }

    private double calculateMissingMoney() {
        return drink.getCost() - nbMoney;
    }

    private boolean isEnoughMoney() {
        return nbMoney >= drink.getCost();
    }

    private String concatSugar(String nbSugar) {
        if (hasSugar(nbSugar)) return " with no sugar and therefore no stick";
        return " with " + nbSugar + " sugars and a stick";
    }

    private boolean hasSugar(String nbSugar) {
        return "0".equals(nbSugar);
    }

    private void splitInstruction(String instruction) {
        String[] instructionElements = instruction.split(":");
        drink = Drink.valueOf(instructionElements[0]);
        nbSugar = instructionElements.length <= 1 ? "0" : instructionElements[1];
        nbMoney = instructionElements.length <= 1 ? 0.0 : Double.parseDouble(instructionElements[2]);
    }
}
