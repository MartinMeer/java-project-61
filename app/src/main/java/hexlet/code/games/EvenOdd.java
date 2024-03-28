package hexlet.code;

import java.util.Random;
import java.util.Scanner;
public class EvenOdd {

    private static Random random = new Random();
    //private static int randomNumber = random.nextInt(99);
    private static Scanner scanner = new Scanner(System.in);


    public static void playEvenOdd() {
        Cli.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int counter = 0;
        while (counter < 3) {
            int randomNumber = random.nextInt(1,99);
            String correctAnswer = checkNumber(randomNumber);
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
        private static String checkNumber(int number){
            if ((number % 2) == 0) {
                return "yes";
            } else {
                return "no";
        }
    }
}



