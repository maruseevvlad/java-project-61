package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class IsEvenGame {
    public static void isEven(String[] args) {
        Engine.greeting(args);
        String[][] answersQuestions = new String[Engine.getAnswercount()][Engine.ANSWERQUESTIONCOUNT];
        for (var i = 0; i < answersQuestions.length; i++) {
            var questionNumber = Utils.randomNumber(Utils.getMIN(), Utils.getMAX());
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
        Engine.isCorrect(answersQuestions);
    }
}
