package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String menu = """
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""";
        System.out.print(menu);

        Scanner scanner = new Scanner(System.in);
        int game = scanner.nextInt();
        switch (game) {
            case (1):
                String greet = "Welcome to the Brain Games!";
                System.out.println("\n" + greet);
                break;
            case (2):
                Engine.makeGame(new Even());
                break;
            case (3):
                Engine.makeGame(new Calc());
                break;
            case (4):
                Engine.makeGame(new GCD());
                break;
            case (5):
                Engine.makeGame(new Progression());
                break;
            case (6):
                Engine.makeGame(new Prime());
                break;
            default:
                break;
        }
    }
}
