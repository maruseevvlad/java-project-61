package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Arrays;
import hexlet.code.Utils;

public class ProgressionGame {
    public static void progression(String[] args) {
        Engine.greeting(args);
        String[][] answersQuestions = new String[Engine.answersCount][Engine.ANSWERQUESTIONCOUNT];
        var arrayLength = Engine.getArrayLengthProgressionGame();
        for (var i = 0; i < answersQuestions.length; i++) {

            String[] numbers = new String[arrayLength];
            var startNumber = Utils.randomNumber(1, Utils.getMAX());
            var incrementNumber = Utils.randomNumber(1, Utils.getMAX());
            var secretNumber = Utils.randomNumber(0, arrayLength - 1);
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
        Engine.isCorrect(answersQuestions);
    }
}
