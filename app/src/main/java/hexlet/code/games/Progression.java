package hexlet.code.games;

import hexlet.code.Utils;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public final class Progression implements Game {
    private static final int[] RANDOM_ORIGINS = {1, 5};
    private static final int[] RANDOM_BOUNDS = {9, 11, 30};
    
    @Override
    public String getRules() {
        return "What number is missing in the progression?";
    }

    /*Для генерации прогрессии лучше сделать отдельный детерминированный метод, не зависящий от случайных чисел.
    При необходимости такой метод будет легче тестировать.
    Принимать на вход он должен 3 параметра: первое число, длинну прогрессии и шаг, а возвращать массив.*/

    private static String[] generateProgression(int initialTerm, int difference, int bound) {
        String[] progression = new String[bound];
        int currentTerm = initialTerm;
        for (int i = 1; i < bound; i++) {
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
        int initialTerm = Utils.randomizer(RANDOM_ORIGINS[0], RANDOM_BOUNDS[2]);
        int difference = Utils.randomizer(RANDOM_ORIGINS[0], RANDOM_BOUNDS[0]);
        int bound = Utils.randomizer(RANDOM_ORIGINS[1], RANDOM_BOUNDS[1]);
        String[] progression = generateProgression(initialTerm, difference, bound);
        int indexOfAnswer = Utils.randomizer(RANDOM_ORIGINS[0], bound - 1);
        String answer = progression[indexOfAnswer];
        progression[indexOfAnswer] = "..";
        String task = String.join(" ", progression);
        return new String[] {task, answer};
    }
}
