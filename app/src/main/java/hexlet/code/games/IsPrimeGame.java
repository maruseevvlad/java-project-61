package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;

public class IsPrimeGame extends Engine {
    public static void isPrime(String[] args) {
        Engine.greeting(args);
        var  min = 10;
        var  max = 100;
        max -= min;
        while (userCount != NEEDWIN) {
            Scanner scanner = new Scanner(System.in);
            var questionNumber = (int) (Math.random() * ++max) + min;
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            System.out.println("Question: " + questionNumber);
            var answer = scanner.nextLine();
            var correctAnswer = "";

            for (int i = 2; i <= questionNumber / 2; i++) {
                if (questionNumber % i == 0) {
                    correctAnswer = "no";
                    break;
                } else {
                    correctAnswer = "yes";
                }
            }

            if (!Engine.isCorrect(answer, correctAnswer)) {
                break;
            }

            if (userCount == NEEDWIN) {
                System.out.println("Congratulations, " + protectedUserName + "!");
                break;
            }
        }
    }
}
