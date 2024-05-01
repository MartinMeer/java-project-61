package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static Scanner scanner = new Scanner(System.in);
    private static String userName;

    public static String getUserName() {
        return userName;
    }
    public static String userInput() {
        return scanner.nextLine();
    }

    public static void greeting() {
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
