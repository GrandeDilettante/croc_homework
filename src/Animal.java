/**
 * Животное.
 */
public class Animal {

    /**
     * Данные.
     */
    private final String nameAnimal;


    public Animal(String data) {
        this.nameAnimal = data;
    }

    public String getData() {
        return nameAnimal;
    }

    /**
     * Возвращает текстовое представление класса.
     *
     * @return текст
     */
    public String toString() {
        return nameAnimal;
    }

}
