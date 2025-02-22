package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.protectedUserName;
import static hexlet.code.Engine.userCount;

public class calcGame {
    public static void calc(String[] args) {
        Engine.greeting(args);

        while (userCount != 3) {
            Scanner scanner = new Scanner(System.in);
            var randNumber1 = (int)(Math.random() * 10) + 1;
            var randNumber2 = (int)(Math.random() * 10) + 1;
            var randOperation = "";
            var correctAnswer = 0;
            if (randNumber1 > randNumber2) {
                randOperation = "+";
                correctAnswer = randNumber1 + randNumber2;
            } else if (randNumber1 < randNumber2) {
                randOperation = "*";
                correctAnswer = randNumber1 * randNumber2;
            } else {
                randOperation = "-";
                correctAnswer = randNumber1 - randNumber2;
            }

            System.out.println("What is the result of the expression?\n" +
                    "Question: " + randNumber1 + " " + randOperation +  " " + randNumber2);
            var answer = scanner.nextLine();

            if (Engine.isCorrect(answer, String.valueOf(correctAnswer)) == false) {
                break;
            }

            if (userCount == 3) {
                System.out.println("Congratulations, " + protectedUserName + "!");
                break;
            }
        }
    }

}
