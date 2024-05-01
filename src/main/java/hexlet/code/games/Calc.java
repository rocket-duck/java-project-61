package hexlet.code.games;

public class Calc implements GameData {
    public String getRules() {
        return "What is the result of the expression?";
    }

    public String[] getQuestionAndAnswer() {
        int num1 = 1 + (int) (Math.random() * 10);
        int num2 = 1 + (int) (Math.random() * 10);

        String[] symbols = {"+", "-", "*"};
        int questionSymbol = (int) (Math.random() * 3);

        String question = "";
        int answer = 0;

        switch (symbols[questionSymbol]) {
            case ("+") -> {
                question = num1 + " " + symbols[questionSymbol] + " " + num2;
                answer = num1 + num2;
            }
            case ("-") -> {
                question = num1 + " " + symbols[questionSymbol] + " " + num2;
                answer = num1 - num2;
            }
            case ("*") -> {
                question = num1 + " " + symbols[questionSymbol] + " " + num2;
                answer = num1 * num2;
            }
        }

        return new String[]{question, String.valueOf(answer)};
    }
}