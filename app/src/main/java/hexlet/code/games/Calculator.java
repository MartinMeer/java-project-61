package hexlet.code.games;

import hexlet.code.Engine;

public class Calculator implements Game {

    @Override
    public String getRules() {
        return "What is the result of the expression?";
    }

    @Override
    public String[] generateRound() {
        int a = Engine.randomizer(0, 20);
        int b = Engine.randomizer(0, 20);
        String[] operators = {"+", "-", "*"};
        String givenOperator = operators[Engine.randomizer(0, 3)];
        String task = a + " " + givenOperator + " " + b;
        return switch (givenOperator) {
            case "+" -> new String[] {task, String.valueOf((a + b))};
            case "-" -> new String[] {task, String.valueOf((a - b))};
            case "*" -> new String[] {task, String.valueOf((a * b))};
            default -> new String[0];
        };
    }
}
