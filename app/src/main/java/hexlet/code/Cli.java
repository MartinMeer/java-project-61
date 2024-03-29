package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String userName;
    private static Scanner scanner = new Scanner(System.in);

    public static String getUserName() {
        return userName = userName;
    }

    public static void toPrint(String str){
        System.out.println();
    }
     public static String toScan() {
        return scanner.nextLine();
     }
    /*public static int toScan(Scanner scanner) {
        return scanner.nextInt();
    }*/

    public static void greeting() {
        toPrint("Welcome to the Brain Games!\n" +
                "May I have your name? ");
        userName = toScan();
        toPrint("Hello, " + userName + "!");
    }
}
