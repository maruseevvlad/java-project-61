package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;

public class IsPrimeGame extends Engine {
    public static void isPrime(String[] args) {
        Engine.greeting(args);
        String[][] answersQuestions = new String[answersCount][answerQuestionCount];
        for (var i = 0; i < answersQuestions.length; i++) {
            Scanner scanner = new Scanner(System.in);
            var questionNumber = randomNumber(getMIN(), getMAX());
            answersQuestions[i][0] = "Answer 'yes' if given number is prime. Otherwise answer 'no'.\n"
            + "Question: " + questionNumber;
            var answer = scanner.nextLine();
            var correctAnswer = "";

            for (int j = 2; j <= questionNumber / 2; j++) {
                if (questionNumber % j == 0) {
                    correctAnswer = "no";
                    break;
                } else {
                    correctAnswer = "yes";
                }
            }
            answersQuestions[i][1] = correctAnswer;
        }
        isCorrect(answersQuestions);
    }
}
