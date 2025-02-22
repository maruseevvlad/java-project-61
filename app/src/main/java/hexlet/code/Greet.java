package hexlet.code;

import java.util.Scanner;

public class Greet {
    public static String globalUserName = "";
    public static void greeting(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        String userName = scanner.next();
        globalUserName = userName;
        System.out.println("Hello, " + userName + "!");

    }
}