package homework5.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Задача 1:
 * Создать коллекцию класса ArrayList наполнить ее элементами типа Integer.
 * С помощью Stream'ов:
 * - Удалить дубликаты
 * - Оставить только четные элементы
 * - Вывести сумму оставшихся элементов в стриме
 */

public class Task1 {

    public static void main(String[] args) {
        List<Integer> list = getRandIntegerArrayList();

        System.out.println(list);

        list.stream()
                .distinct()
                .filter(x -> x % 2 == 0)
                .reduce(Integer::sum)
                .ifPresent(System.out::print);
    }

    private static ArrayList<Integer> getRandIntegerArrayList() {
        Random rand = new Random();
        return rand.ints(10, 1, 5)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
    }


}
