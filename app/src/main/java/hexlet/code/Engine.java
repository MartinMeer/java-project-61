package hexlet.code;

import hexlet.code.games.Game;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;


public class Engine {
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);
    private static String userName;
    private static final int GAME_COUNT = 3;

    public static String userInput() {
        return scanner.nextLine();
    }
    public static int randomizer(int origin, int bound) {
        return random.nextInt(origin, bound);
    }

    public static void greeting() {
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        userName = userInput();
        System.out.println("Hello, " + userName + "!");
    }

    public static void playGame(Game game) {
        greeting();
        System.out.println(game.getRules());
        int counter = 0;
        while (counter < GAME_COUNT) {
            String[] round = game.generateRound();
            System.out.print("Question: "
                    + round[0]
                    + "\nYour answer: ");
            String userAnswer = scanner.nextLine();
            if (Objects.equals(userAnswer, round[1])) {
                System.out.println("Correct!");
                counter += 1;
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
