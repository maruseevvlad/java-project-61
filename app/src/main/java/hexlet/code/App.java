package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n 1 - Greet\n 2 - Even\n 0 - Exit");
        String gameNumber = scanner.next();

            switch (gameNumber) {
                case "0": System.out.println("Goodbye");
                    scanner.close();
                    break;
                case "1": Greet.greeting(args);
                    break;
                case "2" : isEvenGame.isEven(args);
                    break;
                default:
                    System.out.println("'" + gameNumber + "' " + "is wrong answer ;(.");
                    scanner.close();
            }

        
    }
}
