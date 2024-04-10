package hexlet.code;

import hexlet.code.games.Game;
import java.util.Random;
import java.util.Scanner;


public class Engine {
    private static Random random = new Random();

    private static Scanner scanner = new Scanner(System.in);

    protected static String userInput() {
        return scanner.nextLine();
    }
    public static int randomizer(int origin, int bound) {
        return random.nextInt(origin, bound);
    }

    private static String userName;
    private static final int GAME_COUNT = 3;



    public static void greeting() {
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        userName = userInput();
        System.out.println("Hello, " + userName + "!");
    }


    public static void playGame(Game game) {
        greeting();
        System.out.println(game.getConditions());
        int counter = 0;
        while (counter < GAME_COUNT) {
            game.makeTask();
            String correctAnswer = game.calculate();
            System.out.print("Question: "
                    + game.getTask()
                    + "\nYour answer: ");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
                counter += 1;
            } else {
                System.out.println("'"
                        + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer
                        + "\'.\n"
                        + "Let's try again, "
                        + userName);
                return;
            }
            System.out.println("Congratulations, "
                    + userName
                    + "!");
        }
    }
}
