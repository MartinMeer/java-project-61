package hexlet.code.games;

import hexlet.code.Utils;
import org.apache.commons.math3.util.ArithmeticUtils;

public final class GCD implements Game {

    private static final int NUMBERS_BOTTOM_LIMIT = 1;
    private static final int NUMBERS_TOP_LIMIT = 30;

    @Override
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String[] generateRound() {
        int a = Utils.generateNumber(NUMBERS_BOTTOM_LIMIT, NUMBERS_TOP_LIMIT);
        int b = Utils.generateNumber(NUMBERS_BOTTOM_LIMIT, NUMBERS_TOP_LIMIT);
        String task = a + " " + b;
        return new String[] {task, String.valueOf(ArithmeticUtils.gcd(a, b))};
    }
}
