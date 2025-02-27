package hexlet.code;
import hexlet.code.games.GcdGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.IsEvenGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.IsPrimeGame;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                """
                        Please enter the game number and press Enter.
                         \
                        1 - Greet
                         \
                        2 - Even
                         \
                        3 - Calc
                         \
                        4 - GCD
                         \
                        5 - Progression
                         \
                        6 - Prime
                         \
                        0 - Exit""");
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
