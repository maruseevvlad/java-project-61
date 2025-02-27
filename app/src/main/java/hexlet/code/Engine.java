package hexlet.code;
import java.util.Scanner;

public class Engine extends Utils{
    protected static final int NEEDWIN = 3;
    private static String protectedUserName = "";
    private static int userCount = 0;
    private static final int ARRAYLENGTHPROGRESSIONGAME = 10;

    public static String getProtectedUserName() {
        return protectedUserName;
    }

    public static int getUserCount() {
        return userCount;
    }

    public static int getArrayLengthProgressionGame() {
        return ARRAYLENGTHPROGRESSIONGAME;
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
}
