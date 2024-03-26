package hexlet.code;

import java.util.Scanner;

public class GameMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static String gameMenu = "Please enter the game number and press Enter.\n" +
            "1 - Greet\n" +
            "2 - Even\n" +
            "0 - Exit";

    public static void selectMenu () {
        System.out.println(gameMenu);
        System.out.print("Your choice: ");
        int menuPoint = (scanner.nextInt());
        switch (menuPoint) {
            case 1: Cli.greeting();
                break;
            case 2:
                EvenOdd.playEvenOdd();
                break;
            case 0:
            break;
        }
    }




}
