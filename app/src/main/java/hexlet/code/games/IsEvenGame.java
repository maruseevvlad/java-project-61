package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class IsEvenGame extends hexlet.code.Engine {
   public static void isEven(String[] args) {
       Engine.greeting(args);
       while (userCount != needWins) {
           Scanner scanner = new Scanner(System.in);
           var questionNumber = (int)(Math.random() * 10) + 1;
           System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
           System.out.println("Question: " + questionNumber);
           var answer = scanner.nextLine();
           var correctAnswer = "";

           if (questionNumber % 2 == 0){
               correctAnswer = "yes";
           } else {
               correctAnswer = "no";
           }

           if (Engine.isCorrect(answer, correctAnswer) == false) {
               break;
           }

           if (userCount == needWins) {
               System.out.println("Congratulations, " + protectedUserName + "!");
               break;
           }
       }
   }
}
