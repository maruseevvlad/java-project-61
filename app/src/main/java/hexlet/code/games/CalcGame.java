
package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;
import java.util.Random;

public class CalcGame extends hexlet.code.Engine {
    public static void calc(String[] args) {
        Engine.greeting(args);
        String[] operationChars = {"+", "-", "*"};
        while (getUserCount() != NEEDWIN) {
            Scanner scanner = new Scanner(System.in);
            var randNumber1 = randomNumber(getMIN(), getMAX());
            var randNumber2 = randomNumber(getMIN(), getMAX());
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
            System.out.println("What is the result of the expression?\n"
                    + "Question: "
                    + randNumber1
                    + " "
                    + randOperationChar
                    +  " "
                    + randNumber2);
            var answer = scanner.nextLine();

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
