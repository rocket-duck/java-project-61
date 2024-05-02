package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String greet = "Welcome to the Brain Games!";
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
        String game = scanner.next();

        System.out.println("\n" + greet);

        switch (game) {
            case ("2"):
                Engine.makeGame(new Even());
            case ("3"):
                Engine.makeGame(new Calc());
            case ("4"):
                Engine.makeGame(new GCD());
            case ("5"):
                Engine.makeGame(new Progression());
            case ("6"):
                Engine.makeGame(new Prime());
            case ("0"):
                System.exit(0);
            default:
                break;
        }
    }
}
