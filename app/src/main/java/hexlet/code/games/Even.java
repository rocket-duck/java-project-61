package hexlet.code.games;

public final class Even implements GameData {
    @Override
    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public String[] getQuestionAndAnswer() {
        final int maxNumber = 100;
        int question = 1 + (int) (Math.random() * maxNumber);
        String answer = (question % 2 == 0) ? "yes" : "no";

        return new String[]{String.valueOf(question), answer};
    }
}
