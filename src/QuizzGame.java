import java.util.Scanner;

public class QuizzGame {
    static void main(String[] args) {
        String[] questions = {"What is the main function of a router?",
                "Which part of the computer is considered the brain?",
                "What year was Facebook launched?",
                "Who is known as the father of computers?",
                "What was the first programming language?"};

        String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                {"1. CPU ", "2. RAM ", "3. Motherboard ", "4. GPU "},
                {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                {"1. Steve Jobs", "2. Michael Jordan", "3. Alan Turing", "4. Charles Babbage"},
                {"1. C++", "2. COBOL", "3. Fortran", "4. Assembly"}};

        int[] correctAnswers = {3, 1, 2, 4, 3};
        int score = 0;
        int answer;


        Scanner scanner = new Scanner(System.in);
        System.out.println("*************************");
        System.out.println("Welcome to the QuizzGame!");
        System.out.println("*************************");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            for(String option : options[i]) {
                System.out.println(option);
            }

            System.out.println("Type your answer here: ");
            answer = scanner.nextInt();

            if(answer == correctAnswers[i]){
                System.out.println("*************************");
                System.out.println("Correct!");
                System.out.println("*************************");
                score++;
            }
            else {
                System.out.println("*************************");
                System.out.println("Incorrect!");
                System.out.println("*************************");
            }
        }
        System.out.println("Final score is: " + score + " out of " + questions.length);
        scanner.close();
    }
}