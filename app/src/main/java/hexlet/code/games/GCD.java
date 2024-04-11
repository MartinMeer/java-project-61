package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.StringUtils;

public class GCD extends Game{
    protected String conditions = "Find the greatest common divisor of given numbers.";
    protected String task;

    public String getTask() {
        return task;
    }


    public String getConditions() {
        return conditions;
    }

    public String makeTask() {
        int a = Engine.randomizer(1, 100);
        int b = Engine.randomizer(1, 100);
        return task = a + " " + b;
    }
    public String calculate() {
        String[] splittedTask = StringUtils.split(task, " ");
        int a = Integer.parseInt(splittedTask[0]);
        int b = Integer.parseInt(splittedTask[2]);

        return "";
    }
}
