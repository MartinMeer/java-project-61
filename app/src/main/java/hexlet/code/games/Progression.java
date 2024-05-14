package hexlet.code.games;

import hexlet.code.Utils;

public final class Progression implements Game {
    private static final int INITIAL_TERM_BOTTOM_LIMIT = 1;
    private static final int INITIAL_TERM_TOP_LIMIT = 30;
    private static final int DIFFERENCE_BOTTOM_LIMIT = 1;
    private static final int DIFFERENCE_TOP_LIMIT = 9;
    private static final int PROGRESSION_LENGTH_BOTTOM_LIMIT = 5;
    private static final int PROGRESSION_LENGTH_TOP_LIMIT = 11;
    private static final int ANSWER_INDEX_BOTTOM_LIMIT = 1;


    @Override
    public String getRules() {
        return "What number is missing in the progression?";
    }

    private static String[] generateProgression(int initialTerm, int difference, int progressionLength) {
        String[] progression = new String[progressionLength];
        int currentTerm = initialTerm;
        for (int i = 1; i < progressionLength; i++) {
            progression[0] = String.valueOf(initialTerm);
            currentTerm += difference;
            progression[i] = String.valueOf(currentTerm);
        }
        return progression;
    }

    @Override
    public String[] generateRound() {
        int initialTerm = Utils.randomizer(INITIAL_TERM_BOTTOM_LIMIT, INITIAL_TERM_TOP_LIMIT);
        int difference = Utils.randomizer(DIFFERENCE_BOTTOM_LIMIT, DIFFERENCE_TOP_LIMIT);
        int progressionLength = Utils.randomizer(PROGRESSION_LENGTH_BOTTOM_LIMIT, PROGRESSION_LENGTH_TOP_LIMIT);
        String[] progression = generateProgression(initialTerm, difference, progressionLength);
        int indexOfAnswer = Utils.randomizer(ANSWER_INDEX_BOTTOM_LIMIT, progressionLength - 1);
        String answer = progression[indexOfAnswer];
        progression[indexOfAnswer] = "..";
        String task = String.join(" ", progression);
        return new String[] {task, answer};
    }
}
