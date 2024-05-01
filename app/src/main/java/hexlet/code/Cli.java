package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static Scanner scanner = new Scanner(System.in);

    public static String  greeting() {
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
