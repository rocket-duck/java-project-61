package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String greet = "Welcome to the Brain Games!";
        String menu = """
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                0 - Exit
                Your choice:\s""";

        System.out.print(menu);

        Scanner scanner = new Scanner(System.in);
        String game = scanner.next();
        switch (game) {
            case ("1"):
                System.out.println(greet);
                break;
            case ("2"):
                System.out.println(greet);
                Engine.makeGame(new Even());
                break;
            case ("3"):
                System.out.println(greet);
                Engine.makeGame(new Calc());
                break;
            default:
                break;
        }
    }
}
