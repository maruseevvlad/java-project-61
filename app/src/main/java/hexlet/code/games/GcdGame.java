package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GcdGame extends Engine {
    public static void gcd(String[] args) {
        Engine.greeting(args);

        while (userCount != needWins) {
            Scanner scanner = new Scanner(System.in);
            var randNumber1 = (int)(Math.random() * 100) + 1;
            var randNumber2 = (int)(Math.random() * 10) + 1;
            var correctAnswer = euclideanAlgorithm(randNumber1, randNumber2);


            System.out.println("Find the greatest common divisor of given numbers.\n" +
                    "Question: " + randNumber1 + " " + randNumber2);
            var answer = scanner.nextLine();

            if (Engine.isCorrect(answer, String.valueOf(correctAnswer)) == false) {
                break;
            }

            if (userCount == needWins) {
                System.out.println("Congratulations, " + protectedUserName + "!");
                break;
            }
        }
    }

    public static int euclideanAlgorithm(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }


}
