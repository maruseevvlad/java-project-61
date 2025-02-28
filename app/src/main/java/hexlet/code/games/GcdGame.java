package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GcdGame {
    public static void gcd(String[] args) {
        Engine.greeting(args);
        String[][] answersQuestions = new String[Engine.getAnswercount()][Engine.ANSWERQUESTIONCOUNT];
        for (var i = 0; i < answersQuestions.length; i++) {
            var randNumber1 = Utils.randomNumber(Utils.getMIN(), Utils.getMAX());
            var randNumber2 = Utils.randomNumber(Utils.getMIN(), Utils.getMAX());
            var correctAnswer = Utils.euclideanAlgorithm(randNumber1, randNumber2);

            answersQuestions[i][0] = "Find the greatest common divisor of given numbers.\n"
                    + "Question: "
                    + randNumber1
                    + " "
                    + randNumber2;

            answersQuestions[i][1] = String.valueOf(correctAnswer);
        }
        Engine.isCorrect(answersQuestions);
    }
}
