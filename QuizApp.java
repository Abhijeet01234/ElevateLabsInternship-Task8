import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        //here I am going to Create a list of quiz questions
        List<QuizQuestion> quizQuestions = new ArrayList<>();
        
        //India-related questions
        quizQuestions.add(new QuizQuestion(
                "\nWhat is the capital of India?",
                new String[]{"1. Mumbai", "2. New Delhi", "3. Kolkata", "4. Bengaluru"},
                1
        ));
        quizQuestions.add(new QuizQuestion(
                "\nWho is known as the 'Father of the Nation' in India?",
                new String[]{"1. Jawaharlal Nehru", "2. Subhas Chandra Bose", "3. Mahatma Gandhi", "4. Sardar Vallabhbhai Patel"},
                2
        ));

        //Questions related to java
        quizQuestions.add(new QuizQuestion(
                "\nWhat keyword is used to declare a constant in Java?",
                new String[]{"1. final", "2. const", "3. static", "4. immutable"},
                0
        ));
        quizQuestions.add(new QuizQuestion(
                "\nWhich of the following is not a Java primitive data type?",
                new String[]{"1. int", "2. double", "3. String", "4. boolean"},
                2
        ));

        System.out.println("\nWelcome to the Online Quiz!");
        System.out.println("Answer the following questions by typing the number of the correct option");
        System.out.println("----------------------------------------------------------------------");

        for (QuizQuestion q : quizQuestions) { //for each loop to go through each Question
            System.out.println("\n" + q.getQuestion());
            for (String option : q.getOptions()) {
                System.out.println(option);
            }
            
            System.out.print("\nYour answer: ");
            try {
                int userAnswer = sc.nextInt() - 1; //I m doing -1 to match the arrays started from 0 index
                if (userAnswer == q.getCorrectAnswerIndex()) {
                    System.out.println("Correct !!");
                    score++;
                } else {
                    System.out.println("Incorrect! The correct answer was option " + (q.getCorrectAnswerIndex() + 1) + ".");// we are using +1 tomatch the real option cause as we know our arrays are 0 index DS.
                }
            } catch (Exception e) {
                System.out.println("Invalid input, Skipping question...");
                sc.next(); //It will clear the invalid input from the sc
            }
        }

        System.out.println("\n----------------------------------------------------------------------");
        System.out.println("Quiz completed!!!");
        System.out.println("\nYour final score is: " + score + " out of " + quizQuestions.size());

        sc.close();
    }
}