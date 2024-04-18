package hexlet.code.games;

import hexlet.code.Engine;

public class EvenOdd implements Game {

    @Override
    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public String[] generateRound() {
        int task = Engine.randomizer(0, 99);
        String answer = task % 2 != 0 ? "no" : "yes";
        return new String[] {String.valueOf(task), answer};
    }
}



