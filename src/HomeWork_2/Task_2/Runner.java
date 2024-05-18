package HomeWork_2.Task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Задание 2.2
 * Создайте класс ImmutablePerson с полями String name, int age, и List<String> hobbies. Создайте класс
 * MutablePerson с такими же полями (String name, int age, и List<String> hobbies). Создайте класс Runner и
 * проверьте изменяемость и неизменяемость объектов.
 */

public class Runner {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Футбол", "Компьютерные игры", "Книги");
        ArrayList<String> hobbies = new ArrayList<>(list);

        MutablePerson mutablePerson = new MutablePerson("Иван", 20, hobbies);
        ImmutablePerson immutablePerson = new ImmutablePerson("Петр", 22, hobbies);

        System.out.println(mutablePerson);
        System.out.println(immutablePerson);

        hobbies.add("Фильмы");
        hobbies.add("Комиксы");

        System.out.println();

        System.out.println(mutablePerson);
        System.out.println(immutablePerson);

    }
}
