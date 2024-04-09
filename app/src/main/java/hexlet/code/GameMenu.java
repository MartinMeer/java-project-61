package hexlet.code;

import hexlet.code.games.EvenOdd;

public class GameMenu {
    private static String gameMenu = """
            Please enter the game number and press Enter.
            1 - Greet
            2 - Even
            0 - Exit""";

    public static void selectMenu() {
        System.out.println(gameMenu);
        System.out.print("Your choice: ");
        int menuPoint = Integer.parseInt((Engine.userInput()));
        switch (menuPoint) {
            case 1: Engine.greeting();
                break;
            case 2: Engine.playGame(new EvenOdd());
                break;
            default: break;
        }
    }




}
