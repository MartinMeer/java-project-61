package hexlet.code;

import hexlet.code.games.Game;
import org.apache.commons.lang3.StringUtils;

public class Engine {
    private static final int GAME_COUNT = 3;

    public static void playGame(Game game) {
        Cli.greeting();
        String userName = Cli.getUserName();
        System.out.println(game.getRules());
        for (int i = 0; i < GAME_COUNT; i++) {
            String[] round = game.generateRound();
            System.out.print("Question: "
                    + round[0]
                    + "\nYour answer: ");
            String userAnswer = Cli.userInput();
            if (StringUtils.equalsIgnoreCase(userAnswer, round[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'"
                        + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                       + round[1]
                        + "'.\n"
                        + "Let's try again, "
                        + userName
                        + "!");
                return;
            }
        }
        System.out.println("Congratulations, "
                + userName
                + "!");
    }
}
