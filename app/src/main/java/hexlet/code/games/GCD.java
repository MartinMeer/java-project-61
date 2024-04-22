package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.math3.util.ArithmeticUtils;

public final class GCD implements Game {

    private final int[] RANDOM_ORIGINS = {0};
    private final int[] RANDOM_BOUNDS = {30};

    @Override
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String[] generateRound() {
        int a = Engine.randomizer(RANDOM_ORIGINS[0], RANDOM_BOUNDS[30]);
        int b = Engine.randomizer(RANDOM_ORIGINS[1], RANDOM_BOUNDS[30]);
        String task = a + " " + b;
        return new String[] {task, String.valueOf(ArithmeticUtils.gcd(a, b))};
    }
}
