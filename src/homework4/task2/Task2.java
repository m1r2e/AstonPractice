package homework4.task2;

import java.util.LinkedList;
import java.util.List;

/**
 * Задача 2:
 * 2.1 Создать двусвязный список стран мира.
 * 2.2 Добавить к этому списку 4 страны ( 2 в начало и 2 в конец), вывести результат в
 * консоль (Использовать методы addFirst/addLast).
 * 2.3 Удалить по одному элементу из начала и из конца списка.
 * 2.4 Получить по одному элементу из начала и из конца списка.
 */

public class Task2 {

    public static void main(String[] args) {

        List<String> counties = new LinkedList<>(List.of("Россия", "США", "Китай", "Индия"));

        counties.addFirst("Бразилия");
        counties.addFirst("Беларусь");
        counties.addLast("Япония");
        counties.addLast("Южная Корея");

        System.out.println(counties);

        counties.removeFirst();
        counties.removeLast();

        System.out.println(counties.getFirst());
        System.out.println(counties.getLast());
    }
}
