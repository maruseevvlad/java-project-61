package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;

public class IsEvenGame extends hexlet.code.Engine {
    public static void isEven(String[] args) {
        Engine.greeting(args);
        String[][] answersQuestions = new String[answersCount][ANSWERQUESTIONCOUNT];
        for (var i = 0; i < answersQuestions.length; i++) {
            Scanner scanner = new Scanner(System.in);
            var questionNumber = randomNumber(getMIN(), getMAX());
            answersQuestions[i][0] = "Answer 'yes' if the number is even, otherwise answer 'no'.\n"
                + "Question: " + questionNumber;
            var correctAnswer = "";

            if (questionNumber % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            answersQuestions[i][1] = correctAnswer;
        }
        isCorrect(answersQuestions);
    }
}
