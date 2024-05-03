package hexlet.code.games;

import hexlet.code.Utils;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public final class Calculator implements Game {

    private static final int[] RANDOM_ORIGINS = {0};
    private static final int[] RANDOM_BOUNDS = {20, 3};

    @Override
    public String getRules() {
        return "What is the result of the expression?";
    }

    //для вычисления значения выражения тоже лучше сделать отдельный метод

    private int calculation(String expression) {
        String[] splittedExpression = StringUtils.split(expression, " ");
        int a = Integer.parseInt(splittedExpression[0]);
        int b = Integer.parseInt(splittedExpression[2]);
        String operator = splittedExpression[1];
        int result;
        switch (operator) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            default -> result = 0;
        }
        return result;
    }

    @Override
    public String[] generateRound() {
        int a = Utils.randomizer(RANDOM_ORIGINS[0], RANDOM_BOUNDS[0]);
        int b = Utils.randomizer(RANDOM_ORIGINS[0], RANDOM_BOUNDS[0]);
        String[] operators = {"+", "-", "*"};
        String givenOperator = operators[Utils.randomizer(RANDOM_ORIGINS[0], RANDOM_BOUNDS[1])];
        String task = a + " " + givenOperator + " " + b;
        String answer = String.valueOf(calculation(task));
        return new String[] {task, answer};
    }
}
