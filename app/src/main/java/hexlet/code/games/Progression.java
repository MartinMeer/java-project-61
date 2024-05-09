package hexlet.code.games;

import hexlet.code.Utils;

public final class Progression implements Game {
    private static final int[] RANDOM_ORIGINS = {1, 5};
    private static final int RANDOM_ORIGIN_FOR_INITIAL_TERM = 1;
    private static final int RANDOM_BOUND_FOR_INITIAL_TERM = 30;
    private static final int RANDOM_ORIGIN_FOR_DIFFERENCE = 1;
    private static final int RANDOM_BOUND_FOR_DIFFERENCE = 9;
    private static final int RANDOM_ORIGIN_PROGRESSION_LENGTH = 5;
    private static final int RANDOM_BOUND_PROGRESSION_LENGTH = 11;
    private static final int RANDOM_ORIGIN_FOR_ANSWER_INDEX = 1;
    private static final int[] RANDOM_BOUNDS = {9, 11, 30};

    @Override
    public String getRules() {
        return "What number is missing in the progression?";
    }

    /*Для генерации прогрессии лучше сделать отдельный детерминированный метод, не зависящий от случайных чисел.
    При необходимости такой метод будет легче тестировать.
    Принимать на вход он должен 3 параметра: первое число, длинну прогрессии и шаг, а возвращать массив.*/

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
    /*у нас же массив строк.
    Можно сохранить индекс скрываемого элемента в переменную, а потом просто по индексу заменить нужный элемент на "..".
    A чтоб привести массив к строке можно использовать метод String.join*/
    @Override
    public String[] generateRound() {
        int initialTerm = Utils.randomizer(RANDOM_ORIGIN_FOR_INITIAL_TERM, RANDOM_BOUND_FOR_INITIAL_TERM);
        int difference = Utils.randomizer(RANDOM_ORIGIN_FOR_DIFFERENCE, RANDOM_BOUND_FOR_DIFFERENCE);
        int progressionLength = Utils.randomizer(RANDOM_ORIGIN_PROGRESSION_LENGTH, RANDOM_BOUND_PROGRESSION_LENGTH);
        String[] progression = generateProgression(initialTerm, difference, progressionLength);
        int indexOfAnswer = Utils.randomizer(RANDOM_ORIGIN_FOR_ANSWER_INDEX, progressionLength - 1);
        String answer = progression[indexOfAnswer];
        progression[indexOfAnswer] = "..";
        String task = String.join(" ", progression);
        return new String[] {task, answer};
    }
}
