package hexlet.code;
import java.util.Scanner;

public class Engine {
    protected static final int NEEDWIN = 3;
    private static String protectedUserName = "";
    private static int userCount = 0;
    private static final int MIN = 10;
    private static final int MAX = 30;

    public static int getMIN() {
        return MAX;
    }

    public static int getMAX() {
        return MIN;
    }

    public static String getProtectedUserName() {
        return protectedUserName;
    }

    public static int getUserCount() {
        return userCount;
    }

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
