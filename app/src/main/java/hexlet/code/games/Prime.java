package hexlet.code.games;

import hexlet.code.Utils;
import org.apache.commons.math3.primes.Primes;

public final class Prime implements Game {
    private static final int TASK_BOTTOM_LIMIT = 2;
    private static final int TASK_TOP_LIMIT = 20;
    @Override
    public String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
    @Override
    public String[] generateRound() {
        int task = Utils.randomizer(TASK_BOTTOM_LIMIT, TASK_TOP_LIMIT);
        String answer = (Primes.isPrime(task)) ? "yes" : "no";
        return new String[]{String.valueOf(task), answer};
    }
}
