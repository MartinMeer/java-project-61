package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.math3.util.ArithmeticUtils;

public class GCD {
    protected String conditions = "Find the greatest common divisor of given numbers.";
    protected String task;

    public String getTask() {
        return task;
    }


    public String getConditions() {
        return conditions;
    }

    public String makeTask() {
        int a = Engine.randomizer(1, 30);
        int b = Engine.randomizer(1, 30);
        task = a + " " + b;
        return task;
    }
    public String calculate() {
        String[] splittedTask = StringUtils.split(task, " ");
        int a = Integer.parseInt(splittedTask[0]);
        int b = Integer.parseInt(splittedTask[1]);

        return String.valueOf(ArithmeticUtils.gcd(a, b));
    }
}
