package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String userName;
    private static Scanner scanner = new Scanner(System.in);

    public static void greeting () {
        System.out.print("May I have your name? ");
        userName = scanner.nextLine();
        System.out.println("Hello, " +userName+ "!");
    }
}
