package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class IsPrimeGame {
    public static void isPrime(String[] args) {
        Engine.greeting(args);
        String[][] answersQuestions = new String[Engine.getAnswercount()][Engine.ANSWERQUESTIONCOUNT];
        for (var i = 0; i < answersQuestions.length; i++) {
            var questionNumber = Utils.randomNumber(Utils.getMIN(), Utils.getMAX());
            answersQuestions[i][0] = "Answer 'yes' if given number is prime. Otherwise answer 'no'.\n"
                + "Question: " + questionNumber;
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
        Engine.isCorrect(answersQuestions);
    }
}
