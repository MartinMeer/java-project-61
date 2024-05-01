package hexlet.code.games;

import hexlet.code.Utils;
import org.apache.commons.math3.util.ArithmeticUtils;

public final class GCD implements Game {

    private static final int[] RANDOM_ORIGINS = {1};
    private static final int[] RANDOM_BOUNDS = {30};

    @Override
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String[] generateRound() {
        int a = Utils.randomizer(RANDOM_ORIGINS[0], RANDOM_BOUNDS[0]);
        int b = Utils.randomizer(RANDOM_ORIGINS[0], RANDOM_BOUNDS[0]);
        String task = a + " " + b;
        return new String[] {task, String.valueOf(ArithmeticUtils.gcd(a, b))};
    }
}
