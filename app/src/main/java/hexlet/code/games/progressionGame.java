package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import java.util.Arrays;

public class progressionGame extends Engine {
    public static void progression(String[] args) {
        Engine.greeting(args);

        while (userCount != needWins) {
            Scanner scanner = new Scanner(System.in);

            String[] numbers = new String[10];
            var startNumber = (int)(Math.random()*10 + 1);
            var incrementNumber = (int)(Math.random()*10 + 1);
            var secretNumber = (int)(Math.random()*(9 - 1) + 1);
            numbers[0] = String.valueOf(startNumber);
            for (int i = 1; i < numbers.length; i++) {
                var tmp = startNumber += incrementNumber;
                numbers[i] = String.valueOf(tmp);
            }

            var correctAnswer = numbers[secretNumber];
            numbers[secretNumber] = "..";

            System.out.println("What number is missing in the progression?\n" +
                    "Question: " + Arrays.toString(numbers).replace("[", "").replace("]", "").replace(",", ""));
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
}
