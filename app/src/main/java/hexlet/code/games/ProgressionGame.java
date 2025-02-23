package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;
import java.util.Arrays;

public class ProgressionGame extends Engine {
    public static void progression(String[] args) {
        Engine.greeting(args);

        while (userCount != NEEDWIN) {
            Scanner scanner = new Scanner(System.in);
            String[] numbers = new String[10];
            var startNumber = randomNumber(1, 20);
            var incrementNumber = randomNumber(1, 20);
            var secretNumber = randomNumber(0, 9);
            numbers[0] = String.valueOf(startNumber);
            for (int i = 1; i < numbers.length; i++) {
                startNumber += incrementNumber;
                numbers[i] = String.valueOf(startNumber);
            }

            var correctAnswer = numbers[secretNumber];
            numbers[secretNumber] = "..";

            System.out.println("What number is missing in the progression?\n"
                    + "Question: "
                    + Arrays.toString(numbers)
                    .replace("[", "")
                    .replace("]", "")
                    .replace(",", ""));
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
