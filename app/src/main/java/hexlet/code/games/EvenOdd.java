package hexlet.code.games;

import hexlet.code.Utils;

public final class EvenOdd implements Game {

    private static final int TASK_BOTTOM_LIMIT = 0;
    private static final int TASK_TOP_LIMIT = 99;

    @Override
    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    private boolean isEven(int number) {
        int a = number % 2;
        return a == 0;
    }
    @Override
    public String[] generateRound() {
        int task = Utils.randomizer(TASK_BOTTOM_LIMIT, TASK_TOP_LIMIT);
        String answer = isEven(task) ? "yes" : "no";
        return new String[] {String.valueOf(task), answer};
    }
}



