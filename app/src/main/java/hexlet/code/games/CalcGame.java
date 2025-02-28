
package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class CalcGame {
    public static void calc(String[] args) {
        Engine.greeting(args);
        String[][] answersQuestions = new String[Engine.answersCount][Engine.ANSWERQUESTIONCOUNT];
        String[] operationChars = {"+", "-", "*"};
        for (var i = 0; i < answersQuestions.length; i++) {
            var randNumber1 = Utils.randomNumber(Utils.getMIN(), Utils.getMAX());
            var randNumber2 = Utils.randomNumber(Utils.getMIN(), Utils.getMAX());
            var correctAnswer = 0;
            Random rand = new Random();
            var randOperationChar = operationChars[rand.nextInt(operationChars.length)];
            correctAnswer = switch (randOperationChar) {
                case "+" -> {
                    randOperationChar = "+";
                    yield randNumber1 + randNumber2;
                }
                case "-" -> {
                    randOperationChar = "-";
                    yield randNumber1 - randNumber2;
                }
                case "*" -> {
                    randOperationChar = "*";
                    yield randNumber1 * randNumber2;
                }
                default -> correctAnswer;
            };
            answersQuestions[i][0] = String.valueOf("What is the result of the expression?\n"
                    + "Question: "
                    + randNumber1
                    + " "
                    + randOperationChar
                    +  " "
                    + randNumber2);
            answersQuestions[i][1] = String.valueOf(correctAnswer);
        }
        Engine.isCorrect(answersQuestions);
    }
}
