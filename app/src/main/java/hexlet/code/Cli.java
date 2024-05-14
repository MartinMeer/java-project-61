package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String  greet() {
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        String userName = SCANNER.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
