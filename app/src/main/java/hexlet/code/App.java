package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.EvenOdd;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        final String gameMenu = """
            Please enter the game number and press Enter.
            1 - Greet
            2 - Even
            3 - Calc
            4 - GCD
            5 - Progression
            6 - Prime
            0 - Exit""";

        System.out.println(gameMenu);
        System.out.print("Your choice: ");
        String menuPoint = StringUtils.strip(Cli.userInput());
        switch (menuPoint) {
            case "1": Cli.greeting();
                break;
            case "2": Engine.playGame(new EvenOdd());
                break;
            case "3": Engine.playGame(new Calculator());
                break;
            case "4": Engine.playGame(new GCD());
                break;
            case "5": Engine.playGame(new Progression());
                break;
            case "6": Engine.playGame(new Prime());
                break;
            default: break;
        }
    }
}
