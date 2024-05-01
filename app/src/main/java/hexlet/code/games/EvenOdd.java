package hexlet.code.games;

import hexlet.code.Utils;

public final class EvenOdd implements Game {

    private static final int[] RANDOM_ORIGINS = {0};
    private static final int[] RANDOM_BOUNDS = {99};

    @Override
    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public String[] generateRound() {
        int task = Utils.randomizer(RANDOM_ORIGINS[0], RANDOM_BOUNDS[0]);
        String answer = task % 2 != 0 ? "no" : "yes";
        return new String[] {String.valueOf(task), answer};
    }
}



