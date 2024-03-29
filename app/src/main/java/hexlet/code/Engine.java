package hexlet.code;

import hexlet.code.Cli;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Engine {

    private static Random random = new Random();
    //private static int randomNumber = random.nextInt(99);
    private static String conditions;



    private static void toPrintConditions (String str) {
        Cli.greeting();
        System.out.println(str);
    }
    /*public static String checkConditions(int number) {
        return str;
    }*/

    /*public static int checkConditions() {
        return num
    }*/

    public static void playEngine() {
        toPrintConditions(conditions);
        int counter = 0;
        while (counter < 3) {
            toSetQuestion();
            String userAnswer = Cli.toScan();
                if (checkConditions()) {
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
    private static boolean checkConditions() {
        return true;
    }

        private static void toSetQuestion() {
            String question = "";
            System.out.print("Question: " +
                    question +
                    "\nYour answer: ");
    }
    /*private static String checkCondition(){
            if ((number % 2) == 0) {
                return "yes";
            } else {
                return "no";
        }*/
    }
}



