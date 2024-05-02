package hexlet.code.games;

public class Prime implements GameData {
    public String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public String[] getQuestionAndAnswer() {
        int question = 1 + (int) (Math.random() * 100);
        String answer = isPrime(question) ? "yes" : "no";

        return new String[]{String.valueOf(question), answer};
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= num / 2; i += 1) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
