package hexlet.code.games;

public class GCD implements GameData {
    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public String[] getQuestionAndAnswer() {
        int num1 = 1 + (int) (Math.random() * 100);
        int num2 = 1 + (int) (Math.random() * 100);

        String question = num1 + " " + num2;
        int answer = findGCD(num1, num2);

        return new String[]{question, String.valueOf(answer)};
    }

    private int findGCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return findGCD(n2, n1 % n2);
    }
}