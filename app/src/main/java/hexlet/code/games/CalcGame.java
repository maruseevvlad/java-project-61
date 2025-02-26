package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;
import java.util.Random;

public class CalcGame extends hexlet.code.Engine {
    public static void calc(String[] args) {
        Engine.greeting(args);
        String[] operationChars = {"+", "-", "*"};
        while (userCount != NEEDWIN) {
            Scanner scanner = new Scanner(System.in);
            var randNumber1 = randomNumber(minRandomNumber, maxRandomNumber);
            var randNumber2 = randomNumber(minRandomNumber, maxRandomNumber);
            var correctAnswer = 0;
            Random rand = new Random();
            var randOperationChar = operationChars[rand.nextInt(operationChars.length)];
            if (randOperationChar.equals("+")) {
                randOperationChar = "+";
                correctAnswer = randNumber1 + randNumber2;
            } else if (randOperationChar.equals("-")) {
                randOperationChar = "-";
                correctAnswer = randNumber1 - randNumber2;
            } else {
                randOperationChar.equals("*");
                correctAnswer = randNumber1 * randNumber2;
            }

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

            if (userCount == NEEDWIN) {
                System.out.println("Congratulations, " + protectedUserName + "!");
                break;
            }
        }
    }

}
