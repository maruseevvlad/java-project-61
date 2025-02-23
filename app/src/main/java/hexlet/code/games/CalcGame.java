package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;

public class CalcGame extends hexlet.code.Engine {
    public static void calc(String[] args) {
        Engine.greeting(args);
        while (userCount != NEEDWIN) {
            Scanner scanner = new Scanner(System.in);
            var randNumber1 = randomNumber(1, 20);
            var randNumber2 = randomNumber(1, 20);
            var randOperation = "";
            var correctAnswer = 0;
            var randOperationNumber = randomNumber(1, 4);
            if (randOperationNumber == 1) {
                randOperation = "+";
                correctAnswer = randNumber1 + randNumber2;
            } else if (randOperationNumber == 2) {
                randOperation = "-";
                correctAnswer = randNumber1 - randNumber2;
            } else {
                randOperation = "*";
                correctAnswer = randNumber1 * randNumber2;
            }

            System.out.println("What is the result of the expression?\n"
                    + "Question: "
                    + randNumber1
                    + " "
                    + randOperation
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
