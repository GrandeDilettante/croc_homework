/**
 * Сотрудник.
 */
public class Employee {
    /**
     * Данные.
     */
    private final String informOfEating;

    public Employee(String data) {
        this.informOfEating = data;
    }

    public String getData() {
        return informOfEating;
    }
    /**
     * Возвращает текстовое представление класса.
     *
     * @return текст
     */

    public String toString() {
        return informOfEating;
    }
}
