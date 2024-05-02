package hexlet.code.games;

public final class Calc implements GameData {
    @Override
    public String getRules() {
        return "What is the result of the expression?";
    }

    @Override
    public String[] getQuestionAndAnswer() {
        final int maxNumber = 10;
        int num1 = 1 + (int) (Math.random() * maxNumber);
        int num2 = 1 + (int) (Math.random() * maxNumber);

        String[] symbols = {"+", "-", "*"};

        int questionSymbol = (int) (Math.random() * symbols.length);

        String question = "";
        int answer = 0;

        switch (symbols[questionSymbol]) {
            case ("+"):
                question = num1 + " " + symbols[questionSymbol] + " " + num2;
                answer = num1 + num2;
                break;
            case ("-"):
                question = num1 + " " + symbols[questionSymbol] + " " + num2;
                answer = num1 - num2;
                break;
            case ("*"):
                question = num1 + " " + symbols[questionSymbol] + " " + num2;
                answer = num1 * num2;
                break;
            default:
                break;
        }

        return new String[]{question, String.valueOf(answer)};
    }
}
