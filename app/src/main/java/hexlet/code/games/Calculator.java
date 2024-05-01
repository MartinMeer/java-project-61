package hexlet.code.games;

import hexlet.code.Utils;

public final class Calculator implements Game {

    private static final int[] RANDOM_ORIGINS = {0};
    private static final int[] RANDOM_BOUNDS = {20, 3};

    @Override
    public String getRules() {
        return "What is the result of the expression?";
    }

    @Override
    public String[] generateRound() {
        int a = Utils.randomizer(RANDOM_ORIGINS[0], RANDOM_BOUNDS[0]);
        int b = Utils.randomizer(RANDOM_ORIGINS[0], RANDOM_BOUNDS[0]);
        String[] operators = {"+", "-", "*"};
        String givenOperator = operators[Utils.randomizer(RANDOM_ORIGINS[0], RANDOM_BOUNDS[1])];
        String task = a + " " + givenOperator + " " + b;
        return switch (givenOperator) {
            case "+" -> new String[] {task, String.valueOf((a + b))};
            case "-" -> new String[] {task, String.valueOf((a - b))};
            case "*" -> new String[] {task, String.valueOf((a * b))};
            default -> new String[0];
        };
    }
}
