package hexlet.code.games;

/*Показываем игроку ряд чисел, образующий арифметическую прогрессию, заменив любое из чисел двумя точками.
Игрок должен определить это число.
Рекомендуемая длина прогрессии – 10 чисел.
Длина может генерироваться случайным образом, но должна содержать не менее 5-ти чисел!
Позиция спрятанного элемента каждый раз изменяется (выбирается случайным образом).
What number is missing in the progression?
Question: 5 7 9 11 13 .. 17 19 21 23*/

import hexlet.code.Engine;

public class Progression implements Game {
    @Override
    public String getRules() {
        return "What number is missing in the progression?";
    }

    @Override
    public String[] generateRound() {
        int initialTerm = Engine.randomizer(1, 30);
        int difference = Engine.randomizer(1, 9);
        int bound = Engine.randomizer(5, 11);
        String[] progression = new String[bound];
        int currentTerm = initialTerm;
        for (int i = 1; i < bound; i++) {
            progression[0] = String.valueOf(initialTerm);
            currentTerm += difference;
            progression[i] = String.valueOf(currentTerm);
        }
        String answer = progression[Engine.randomizer(1, bound - 1)];
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
