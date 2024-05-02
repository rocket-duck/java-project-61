package hexlet.code.games;

public class Even implements GameData {
    @Override
    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public String[] getQuestionAndAnswer() {
        int question = 1 + (int) (Math.random() * 100);
        String answer = (question % 2 == 0) ? "yes" : "no";

        return new String[]{String.valueOf(question), answer};
    }
}
