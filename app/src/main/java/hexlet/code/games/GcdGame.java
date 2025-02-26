package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;

public class GcdGame extends Engine {
    public static void gcd(String[] args) {
        Engine.greeting(args);
        var maxRandomNumber = 100;
        while (userCount != NEEDWIN) {
            Scanner scanner = new Scanner(System.in);
            var randNumber1 = randomNumber(minRandomNumber, maxRandomNumber);
            var randNumber2 = randomNumber(minRandomNumber, maxRandomNumber);
            var correctAnswer = euclideanAlgorithm(randNumber1, randNumber2);

            System.out.println("Find the greatest common divisor of given numbers.\n"
                    + "Question: "
                    + randNumber1
                    + " "
                    + randNumber2);
            var answer = scanner.nextLine();

            if (!Engine.isCorrect(answer, String.valueOf(correctAnswer))) {
                break;
            }

            if (userCount == NEEDWIN) {
                System.out.println("Congratulations, " + protectedUserName + "!");
                break;
            }
        }
    }
}
