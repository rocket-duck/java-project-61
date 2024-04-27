package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String greet = "Welcome to the Brain Games!";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "0 - Exit\n" +
                "Your choice: ");
        String game = scanner.next();

        switch (game) {
            case ("1"):
                System.out.println(greet);
                getName();
                break;
            case ("2"):
                System.out.println(greet);
                String name = getName();
                evenGame(name);
                break;
            default:
                break;
        }
    }

    public static void evenGame(String name) {
        String announce = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        System.out.println(announce);

        int attemptsCount = 3;

        for (int i = 0; i < attemptsCount; i += 1) {
            int question = getQuestion();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Question: " + question +  "\nYour answer: ");
            String userAnswer = scanner.next();

            String answer;
            if (question % 2 == 0) {
                answer = "yes";
            } else {
                answer = "no";
            }

            if (!userAnswer.equals(answer)) {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + answer + ".\nLet's try again, " + name);
                return;
            } else {
                System.out.println("Correct!");
            }
        }
    }

    public static int getQuestion() {
        return (int) (Math.random() * 100);
    }

    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
