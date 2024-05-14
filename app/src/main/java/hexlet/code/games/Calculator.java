package hexlet.code.games;

import hexlet.code.Utils;
import org.apache.commons.lang3.StringUtils;

public final class Calculator implements Game {
    @Override
    public String getRules() {
        return "What is the result of the expression?";
    }
    private static final int OPERANDS_BOTTOM_LIMIT = 0;
    private static final int OPERANDS_TOP_LIMIT = 20;
    private static final int BOTTOM_LIMIT_FOR_OPERATORS = 0; //FOR - чтобы не путаться при подстановке
    private static final String[] OPERATORS = {"+", "-", "*"};


    private int calculation(String expression) {
        String[] splittedExpression = StringUtils.split(expression, " ");
        int a = Integer.parseInt(splittedExpression[0]);
        int b = Integer.parseInt(splittedExpression[2]);
        String operator = splittedExpression[1];
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
        int a = Utils.randomizer(OPERANDS_BOTTOM_LIMIT, OPERANDS_TOP_LIMIT);
        int b = Utils.randomizer(OPERANDS_BOTTOM_LIMIT, OPERANDS_TOP_LIMIT);
        String givenOperator = OPERATORS[Utils.randomizer(BOTTOM_LIMIT_FOR_OPERATORS, OPERATORS.length)];
        String task = a + " " + givenOperator + " " + b;
        String answer = String.valueOf(calculation(task));
        return new String[] {task, answer};
    }
}
