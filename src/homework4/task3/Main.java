package homework4.task3;

import java.util.HashSet;
import java.util.Set;

/**
 * Задача 3:
 * 3.1 Создать класс Person.
 * 3.2 Создать HashSet в классе Main.
 * 3.3 Добавить к этому списку 3 объекта Person, вывести результат используя for each.
 * 3.4 Удалить 2 объекта из коллекции.
 * 3.5 Проверить, содержится ли оставшийся объект в коллекции.
 */

public class Main {

    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();

        personSet.add(new Person("Иван", 20));
        personSet.add(new Person("Сергей", 21));
        personSet.add(new Person("Петр", 26));

        for (Person person : personSet) {
            System.out.println(person);
        }

        personSet.removeIf(person -> person.getName().equals("Иван"));
        personSet.removeIf(person -> person.getName().equals("Петр"));

        System.out.println(personSet.stream().anyMatch(person -> person.getName().equals("Сергей")));

    }
}
