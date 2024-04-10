package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.EvenOdd;
import org.apache.commons.lang3.StringUtils;

public class GameMenu {
    private static String gameMenu = """
            Please enter the game number and press Enter.
            1 - Greet
            2 - Even
            3 - Calc
            0 - Exit""";

    public static void selectMenu() {
        System.out.println(gameMenu);
        System.out.print("Your choice: ");
        String menuPoint = StringUtils.strip(Engine.userInput());
        switch (menuPoint) {
            case "1": Engine.greeting();
                break;
            case "2": Engine.playGame(new EvenOdd());
                break;
            case "3": Engine.playGame(new Calculator());
            default: break;
        }
    }




}
