package hexlet.code.games;

import hexlet.code.Utils;
import org.apache.commons.lang3.StringUtils;

public final class Calculator implements Game {
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
            case "+" -> {
                return a + b;
            }
            case "-" -> {
                return a - b;
            }
            case "*" -> {
                return a * b;
            }
            default -> {
                return 0;
            }
        }
    }

    @Override
    public String[] generateRound() {
        int randomOrigin = 0;
        int randomBoundForOperands = 20;
        int randomBoundForOperators = 3;
        int a = Utils.randomizer(randomOrigin, randomBoundForOperands);
        int b = Utils.randomizer(randomOrigin, randomBoundForOperands);
        String[] operators = {"+", "-", "*"};
        String givenOperator = operators[Utils.randomizer(randomOrigin, randomBoundForOperators)];
        String task = a + " " + givenOperator + " " + b;
        String answer = String.valueOf(calculation(task));
        return new String[] {task, answer};
    }
}
