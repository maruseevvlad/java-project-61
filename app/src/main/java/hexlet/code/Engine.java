package hexlet.code;
import java.util.Scanner;

public class Engine extends Utils {
    protected static final int NEEDWIN = 3;
    private static String protectedUserName = "";
    private static final int ARRAYLENGTHPROGRESSIONGAME = 10;
    public static int answersCount = 3;
    public static final int ANSWERQUESTIONCOUNT = 2;

    public static int getAnswersCount() {
        return answersCount;
    }

    public static int getANSWERQUESTIONCOUNT() {
        return ANSWERQUESTIONCOUNT;
    }

    public static String getProtectedUserName() {
        return protectedUserName;
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

    public static void isCorrect(String[][] answersQuestions) {
        var userCount = 0;
        for (var i = 0; i < answersQuestions.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(answersQuestions[i][0] + "\n");
            var answer = scanner.nextLine();

            if (answer.equals(answersQuestions[i][1])) {
                System.out.println("Correct!");
                userCount++;
                if (userCount == NEEDWIN) {
                    System.out.println("Congratulations, " + protectedUserName + "!");
                }
            } else {
                System.out.println("'" + answer + "' "
                        + "is wrong answer ;(. Correct answer was "
                        + "'" + answersQuestions[i][1]
                        + "'.\n Let's try again, " + protectedUserName + "!");
                break;
            }
        }
    }
}
