package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Games {

    private static Random random = new Random();
    //private static int randomNumber = random.nextInt(99);
    private static Scanner scanner = new Scanner(System.in);
    private static String conditions = "Answer 'yes' if the number is even, otherwise answer 'no'.";


    public static void playEngine() {
        Cli.greeting();
        System.out.println(conditions);
        int counter = 0;
        while (counter < 3) {
            int randomNumber = random.nextInt(1,99);
            String correctAnswer = checkCondition(randomNumber);
            System.out.print("Question: " +
                    randomNumber +
                    "\nYour answer: ");
            String userAnswer = scanner.nextLine();
                if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                    System.out.println("Correct!");
                    counter += 1;
                } else {
                    System.out.println("'" +
                        userAnswer +
                        "' is wrong answer ;(. Correct answer was '" +
                        correctAnswer +
                        "\'.\n" +
                        "Let's try again, " +
                        Cli.getUserName());
                    break;
                }
            System.out.println("Congratulations, " +
                    Cli.getUserName() +
                    "!");
        }

    }
        private static String checkCondition(int number){
            if ((number % 2) == 0) {
                return "yes";
            } else {
                return "no";
        }
    }
}



