package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;

public class GcdGame extends Engine {
    public static void gcd(String[] args) {
        Engine.greeting(args);
        String[][] answersQuestions = new String[answersCount][answerQuestionCount];
        for (var i = 0; i < answersQuestions.length; i++) {
            Scanner scanner = new Scanner(System.in);
            var randNumber1 = randomNumber(getMIN(), getMAX());
            var randNumber2 = randomNumber(getMIN(), getMAX());
            var correctAnswer = euclideanAlgorithm(randNumber1, randNumber2);

            answersQuestions[i][0] = "Find the greatest common divisor of given numbers.\n"
                    + "Question: "
                    + randNumber1
                    + " "
                    + randNumber2;

            answersQuestions[i][1] = String.valueOf(correctAnswer);
        }
        isCorrect(answersQuestions);
    }
}
