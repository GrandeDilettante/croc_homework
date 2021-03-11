/**
 * Вольер.
 */
public class Aviary {

    /**
     * Данные.
     */
    private final String informOfCleaning;


    public Aviary(String data) {
        this.informOfCleaning = data;
    }

    public String getData() {
        return informOfCleaning;
    }

    /**
     * Возвращает текстовое представление класса.
     *
     * @return текст
     */
    public String toString() {
        return informOfCleaning;
    }


}
