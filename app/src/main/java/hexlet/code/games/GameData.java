package hexlet.code.games;

/**
 * Интерфейс Game для работы классов игр с методом makeGame класса Engine.
 *
 */

public interface GameData {
    /**
     * Метод возвращает строку с правилами игры.
     * @return "текст правил игры"
     */
    String getRules();

    /**
     * Задача метода - сформировать один раунд игры: сгенерировать вопрос и праильный ответ.
     * Возващает String массив из двух элементов: вопрос, ответ.
     * !Важно! Порядок элементов должен быть такой: [0] вопрос, [1] ответ.
     * @return String[question, answer]
     */
    String[] getQuestionAndAnswer();
}
