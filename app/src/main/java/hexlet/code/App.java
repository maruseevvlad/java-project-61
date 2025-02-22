package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;


public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Please enter the game number and press Enter.\n " +
                        "1 - Greet\n " +
                        "2 - Even\n " +
                        "3 - Calc\n " +
                        "4 - GCD\n " +
                        "5 - Progression\n " +
                        "6 - Prime\n " +
                        "0 - Exit");
        String gameNumber = scanner.next();

            switch (gameNumber) {
                case "0": System.out.println("Goodbye");
                    scanner.close();
                    break;
                case "1":
                    System.out.println("Your choice: " + gameNumber + "\n");
                    Engine.greeting(args);
                    break;
                case "2" :
                    System.out.println("Your choice: " + gameNumber + "\n");
                    IsEvenGame.isEven(args);
                    break;
                case "3" :
                    System.out.println("Your choice: " + gameNumber + "\n");
                    CalcGame.calc(args);
                    break;
                case "4" :
                    System.out.println("Your choice: " + gameNumber + "\n");
                    GcdGame.gcd(args);
                    break;
                case "5" :
                    System.out.println("Your choice: " + gameNumber + "\n");
                    ProgressionGame.progression(args);
                    break;
                case "6" :
                    System.out.println("Your choice: " + gameNumber + "\n");
                    IsPrimeGame.isPrime(args);
                    break;
                default:
                    System.out.println("'" + gameNumber + "' " + "is wrong answer ;(.");
                    scanner.close();
            }
    }
}
