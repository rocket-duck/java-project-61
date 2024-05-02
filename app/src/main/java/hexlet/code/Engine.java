package hexlet.code;

import hexlet.code.games.GameData;

import java.util.Scanner;

public class Engine {
    public static void makeGame(GameData gameData) {
        String name = getName();
        System.out.println(gameData.getRules());

        final int attemptsCount = 3;

        for (int i = 0; i < attemptsCount; i += 1) {
            String[] data = gameData.getQuestionAndAnswer();
            String question = data[0];
            String answer = data[1];

            Scanner scanner = new Scanner(System.in);
            System.out.print("Question: " + question +  "\nYour answer: ");
            String userAnswer = scanner.next();

            if (!userAnswer.equals(answer)) {
                System.out.println(userAnswer
                        + " is wrong answer ;(. Correct answer was "
                        + answer
                        + ".\nLet's try again, "
                        + name);
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + name + "!");
    }

    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nWelcome to the Brain Games!\nMay I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
