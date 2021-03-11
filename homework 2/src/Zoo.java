
import java.util.Arrays;

/**
 * Зоопарк.
 */
public class Zoo {
    private Animal[] recordsA = new Animal[]{};

    private Employee[] recordsE = new Employee[]{};

    private Aviary[] recordsAviary = new Aviary[]{};

    private Employee[] recordsEating = new Employee[]{};


    /**
     * Добавить новую запись о животном.
     *
     * @param record запись
     */

    public void addAnimal(Animal record) {
        recordsA = Arrays.copyOf(recordsA, recordsA.length + 1);
        recordsA[recordsA.length - 1] = record;
    }

    /**
     * Добавить новую запись о болезни животного.
     *
     * @param record запись
     */

    public void addAnimalDisease(Employee record) {
        recordsE = Arrays.copyOf(recordsE, recordsE.length + 1);
        recordsE[recordsE.length - 1] = record;
    }

    /**
     * Добавить новую запись об уборке вальера.
     *
     * @param record запись
     */
    public void addCleaningAviary(Aviary record) {
        recordsAviary = Arrays.copyOf(recordsAviary, recordsAviary.length + 1);
        recordsAviary[recordsAviary.length - 1] = record;
    }

    /**
     * Добавить новую запись о кормлении животного.
     *
     * @param record запись
     */
    public void addAnimalEating(Employee record) {
        recordsEating = Arrays.copyOf(recordsEating, recordsEating.length + 1);
        recordsEating[recordsEating.length - 1] = record;
    }

    /**
     * Удаляет запись о животном.
     *
     * @param record удаляемая запись
     */
    public void removeAnimal(Animal record) {
        final Animal[] newRecords = new Animal[recordsA.length - 1];
        int index = 0;
        for (Animal currentRecord : recordsA) {
            if (currentRecord != record) {
                newRecords[index++] = currentRecord;
            }
        }
        recordsA = newRecords;
    }

    /**
     * Возвращает все записи о животных.
     *
     * @return список записей о животных
     */
    public Animal[] recordsA() {
        return Arrays.copyOf(recordsA, recordsA.length);
    }

    /**
     * Возвращает все записи О болезнях животных.
     *
     * @return список записей болезней животных
     */

    public Employee[] recordsE() {
        return Arrays.copyOf(recordsE, recordsE.length);
    }

    /**
     * Возвращает все записи Об уборке вальера.
     *
     * @return список записей уборки вальера
     */

    public Aviary[] recordsAviary() {
        return Arrays.copyOf(recordsAviary, recordsAviary.length);
    }

    /**
     * Возвращает все записи О кормлениии животного.
     *
     * @return список записей кормления животных
     */
    public Employee[] recordsEating() {
        return Arrays.copyOf(recordsEating, recordsEating.length);
    }


    public static void main(String[] args) {
        // write your code here
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Animal("Cat"));
        zoo.addAnimal(new Animal("Dog"));
        zoo.addAnimal(new Animal("Bird"));
        zoo.addAnimal(new Animal("Snake"));
        System.out.println(Arrays.toString(zoo.recordsA()));
        zoo.removeAnimal(zoo.recordsA()[1]);
        zoo.removeAnimal(zoo.recordsA()[2]);
        System.out.println(Arrays.toString(zoo.recordsA()));
        zoo.addAnimalDisease(new Employee("Cat disease"));
        zoo.addAnimalDisease(new Employee("Bird disease"));
        zoo.addAnimalDisease(new Employee("Snake disease"));
        System.out.println(Arrays.toString(zoo.recordsE()));
        zoo.addCleaningAviary(new Aviary("Aviary was cleaned on Monday"));
        zoo.addCleaningAviary(new Aviary("Aviary was cleaned on Friday"));
        System.out.println(Arrays.toString(zoo.recordsAviary()));
        zoo.addAnimalEating(new Employee("Cat was fed"));
        zoo.addAnimalEating(new Employee("Bird was fed"));
        System.out.println(Arrays.toString(zoo.recordsEating()));

    }

}