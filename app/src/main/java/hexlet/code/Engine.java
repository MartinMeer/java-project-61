package hexlet.code;

import hexlet.code.games.Game;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Engine {
    private static Scanner scanner = new Scanner(System.in);
    private static final int ROUNDS_COUNT = 3;

    public static void playGame(Game game) {
        String userName = Greeting.greet();
        System.out.println(game.getRules());
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            String[] round = game.generateRound();
            System.out.print("Question: "
                    + round[0]
                    + "\nYour answer: ");
            String userAnswer = scanner.nextLine();
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
