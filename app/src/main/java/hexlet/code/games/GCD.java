package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.math3.util.ArithmeticUtils;

public class GCD implements Game {

    @Override
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String[] generateRound() {
        int a = Engine.randomizer(1, 30);
        int b = Engine.randomizer(1, 30);
        String task = a + " " + b;
        return new String[] {task, String.valueOf(ArithmeticUtils.gcd(a, b))};
    }
}
