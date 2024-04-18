package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.math3.primes.Primes;

public class Prime implements Game {
    @Override
    public String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'";
    }

    @Override
    public String[] generateRound() {
        String task = String.valueOf(Engine.randomizer(2, 20));
        String answer = (Primes.isPrime(Integer.parseInt(task))) ? "yes" : "no";
        return new String[]{task, answer};
    }
}
