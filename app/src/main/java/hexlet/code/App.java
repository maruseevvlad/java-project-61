package hexlet.code;

import hexlet.code.Engine;
import hexlet.code.games.calcGame;
import hexlet.code.games.isEvenGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n 1 - Greet\n 2 - Even\n 3 - Calc\n 0 - Exit");
        String gameNumber = scanner.next();

            switch (gameNumber) {
                case "0": System.out.println("Goodbye");
                    scanner.close();
                    break;
                case "1": Engine.greeting(args);
                    break;
                case "2" : isEvenGame.isEven(args);
                    break;
                case "3" : calcGame.calc(args);
                    break;
                default:
                    System.out.println("'" + gameNumber + "' " + "is wrong answer ;(.");
                    scanner.close();
            }
    }
}
