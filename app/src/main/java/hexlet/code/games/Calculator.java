package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.StringUtils;


public class Calculator extends Game{
    protected String conditions = "What is the result of the expression?";
    protected String task;



    public String getTask() {
        return task;
    }
    public String getConditions() {
        return conditions;
    }
    public String makeTask() {
        int a = Engine.randomizer(0, 20);
        int b = Engine.randomizer(0, 20);
        String[] operators = {"+", "-", "*"};
        String givenOperator = operators[Engine.randomizer(0, 2)];
        task = String.valueOf(a + " " + givenOperator + " " + b);
        return task;
    }
    public String calculate() {
        String[] splittedTask = StringUtils.split(task, " ");
        int a = Integer.parseInt(splittedTask[0]);
        int b = Integer.parseInt(splittedTask[2]);
        String operator = splittedTask[1];
        return switch (operator) {
            case "+" -> String.valueOf((a + b));
            case "-" -> String.valueOf((a - b));
            case "*" -> String.valueOf((a * b));
            default -> "";
        };

    }




}
