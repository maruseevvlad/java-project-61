package hexlet.code;
import java.util.Scanner;

public class Engine {
    protected static final int NEEDWIN = 3;
    protected static String protectedUserName = "";
    protected static int userCount = 0;
    protected static int minRandomNumber = 1;
    protected static int maxRandomNumber = 20;

    public static void greeting(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        protectedUserName = userName;
        System.out.println("Hello, " + userName + "!");
    }
    public static boolean isCorrect(String userAnswer, String correctAnswer) {
        System.out.println("Your answer: " + userAnswer);
        if (correctAnswer.equals(userAnswer)) {
            System.out.println("Correct!");
            userCount++;
        } else {
            System.out.println("'" + userAnswer + "' "
                    + "is wrong answer ;(. Correct answer was "
                    + "'" + correctAnswer
                    + "'.\n Let's try again, " + protectedUserName + "!");
            return false;
        }
        return true;
    }

    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
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
