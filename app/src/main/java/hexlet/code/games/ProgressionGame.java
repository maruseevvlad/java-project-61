package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;
import java.util.Arrays;

public class ProgressionGame extends Engine {
    public static void progression(String[] args) {
        Engine.greeting(args);
        String[][] answersQuestions = new String[answersCount][answerQuestionCount];
        var arrayLength = getArrayLengthProgressionGame();
        for (var i = 0; i < answersQuestions.length; i++) {
            Scanner scanner = new Scanner(System.in);

            String[] numbers = new String[arrayLength];
            var startNumber = randomNumber(1, getMAX());
            var incrementNumber = randomNumber(1, getMAX());
            var secretNumber = randomNumber(0, arrayLength - 1);
            numbers[0] = String.valueOf(startNumber);
            for (int j = 1; j < numbers.length; j++) {
                startNumber += incrementNumber;
                numbers[j] = String.valueOf(startNumber);
            }

            var correctAnswer = numbers[secretNumber];
            numbers[secretNumber] = "..";

            answersQuestions[i][0] = "What number is missing in the progression?\n"
                    + "Question: "
                    + Arrays.toString(numbers)
                    .replace("[", "")
                    .replace("]", "")
                    .replace(",", "");

            answersQuestions[i][1] = correctAnswer;
        }
        isCorrect(answersQuestions);
    }
}
