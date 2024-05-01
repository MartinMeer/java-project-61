package hexlet.code.games;

import hexlet.code.Utils;

public final class Progression implements Game {
    private static final int[] RANDOM_ORIGINS = {1, 5};
    private static final int[] RANDOM_BOUNDS = {9, 11, 30};
    int initialTerm;
    int difference;
    int bound;
    @Override
    public String getRules() {
        return "What number is missing in the progression?";
    }

    /*Для генерации прогрессии лучше сделать отдельный детерминированный метод, не зависящий от случайных чисел.
    При необходимости такой метод будет легче тестировать.
    Принимать на вход он должен 3 параметра: первое число, длинну прогрессии и шаг, а возвращать массив.*/
    @Override
    public String[] generateRound() {
        initialTerm = Utils.randomizer(RANDOM_ORIGINS[0], RANDOM_BOUNDS[2]);
        difference = Utils.randomizer(RANDOM_ORIGINS[0], RANDOM_BOUNDS[0]);
        bound = Utils.randomizer(RANDOM_ORIGINS[1], RANDOM_BOUNDS[1]);

        String[] progression = new String[bound];
        String[] progression = generateProgression(initialTerm, difference, bound);
        int currentTerm = initialTerm;
        for (int i = 1; i < bound; i++) {
            progression[0] = String.valueOf(initialTerm);
            currentTerm += difference;
            progression[i] = String.valueOf(currentTerm);
        }
        String answer = progression[Utils.randomizer(RANDOM_ORIGINS[0], bound - 1)];
        String[] rawTask = new String[bound];
        for (int i = 0; i < bound; i++) {
            if (progression[i].equals(answer)) {
                rawTask[i] = "..";
            } else {
                rawTask[i] = progression[i];
            }
        }
        String task = String.join(" ", rawTask);
        return new String[] {task, answer};
    }
}
