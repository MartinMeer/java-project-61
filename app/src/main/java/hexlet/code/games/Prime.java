package hexlet.code.games;

import hexlet.code.Utils;
import org.apache.commons.math3.primes.Primes;

public final class Prime implements Game {
    private static final int[] RANDOM_ORIGINS = {2};
    private static final int[] RANDOM_BOUNDS = {20};
    @Override
    public String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
    /*лучше сохранить в интовую переменную значение, чтоб потом опять его из строки к числу не парсить*/
    @Override
    public String[] generateRound() {
        int task = Utils.randomizer(RANDOM_ORIGINS[0], RANDOM_BOUNDS[0]);
        String answer = (Primes.isPrime(task)) ? "yes" : "no";
        return new String[]{String.valueOf(task), answer};
    }
}
