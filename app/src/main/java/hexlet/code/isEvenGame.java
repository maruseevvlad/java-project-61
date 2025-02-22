package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Greet.protectedUserName;

public class isEvenGame {
   public static void isEven(String[] args) {
       Greet.greeting(args);
       var score = 0;
       while (score != 3) {
           Scanner scanner = new Scanner(System.in);
           var questionNumber = (int)(Math.random() * 10) + 1;
           System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
           System.out.println("Question: " + questionNumber);
           var answer = scanner.nextLine();
           System.out.println("Your answer: " + answer);
           var correctAnswer = "";

           if (questionNumber % 2 == 0){
               correctAnswer = "yes";
           } else {
               correctAnswer = "no";
           }

           if (questionNumber % 2 == 0 && answer.equals("yes")) {
               score++;
               System.out.println("Correct!");
           } else if (questionNumber % 2 != 0 && answer.equals("no")) {
               score++;
               System.out.println("Correct!");
           } else {
               System.out.println("'" + answer + "' " + "is wrong answer ;(. Correct answer. was " + "'" + correctAnswer + "'.\n Let's try again " + protectedUserName + "!");
               break;
           }
           if (score == 3) {
               System.out.println("Congratulations, " + protectedUserName + "!");
               break;
           }
       }
   }
}
