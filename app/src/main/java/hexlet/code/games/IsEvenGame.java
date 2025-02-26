package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;

public class IsEvenGame extends hexlet.code.Engine {
    public static void isEven(String[] args) {
        Engine.greeting(args);
        while (getUserCount() != NEEDWIN) {
            Scanner scanner = new Scanner(System.in);
            var questionNumber = randomNumber(getMIN(), getMAX());
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            System.out.println("Question: " + questionNumber);
            var answer = scanner.nextLine();
            var correctAnswer = "";

            if (questionNumber % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            if (!Engine.isCorrect(answer, String.valueOf(correctAnswer))) {
                break;
            }

            if (getUserCount() == NEEDWIN) {
                System.out.println("Congratulations, " + getProtectedUserName() + "!");
                break;
            }
        }
    }
}
