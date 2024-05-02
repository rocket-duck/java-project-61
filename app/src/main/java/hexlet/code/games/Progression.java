package hexlet.code.games;

public class Progression implements GameData {
    public String getRules() {
        return "What number is missing in the progression?";
    }

    public String[] getQuestionAndAnswer() {
        final int progressionLength = 10;
        int questionPosition = (int) (Math.random() * (progressionLength - 1));
        String[] progression = getProgression(progressionLength);

        String answer = progression[questionPosition];

        progression[questionPosition] = "..";
        String question = String.join(" ", progression);

        return new String[]{question, answer};
    }

    public String[] getProgression(int progressionLength) {
        final int progressionFirstNum = 1 + (int) (Math.random() * 10);
        final int progressionStep = 1 + (int) (Math.random() * 10);

        String[] progression = new String[progressionLength];
        progression[0] = Integer.toString(progressionFirstNum);

        for (int i = 1; i < progressionLength; i += 1) {
            progression[i] = Integer.toString(
                    Integer.parseInt(progression[i - 1])
                            + progressionStep);
        }

        return progression;
    }
}
