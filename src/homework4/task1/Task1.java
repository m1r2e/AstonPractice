package homework4.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Задача 1:
 * 1.1 Создать коллекцию ArrayList стран мира.
 * 1.2 Добавить к этому cписку 3 страны, вывести результат в консоль.
 * 1.3 Заменить 2-й элемент.
 * 1.4 Удалить его по индексу.
 * 1.5 Удалить любой элемент по значению.
 * 1.6 Узнать индекс любого элемента.
 * 1.7 Проверить, содержится ли элемент в коллекции (любой).
 */

public class Task1 {

    public static void main(String[] args) {
        List<String> countries = new ArrayList<>(List.of("Россия", "США", "Китай", "Индия"));

        countries.add("Иран");
        countries.add("Бразилия");
        countries.add("Беларусь");

        System.out.println(countries);

        countries.set(1, "Франция");
        System.out.println(countries);

        countries.remove(1);
        System.out.println(countries);

        countries.remove(2);
        System.out.println(countries);

        System.out.println(countries.indexOf("Россия"));
        System.out.println(countries.contains("Беларусь"));
        System.out.println(countries.contains("США"));
    }

}
