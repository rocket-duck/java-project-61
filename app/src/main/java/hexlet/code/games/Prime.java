package hexlet.code.games;

public final class Prime implements GameData {
    @Override
    public String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public String[] getQuestionAndAnswer() {
        int maxNumber = 100;
        int question = 1 + (int) (Math.random() * maxNumber);
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
