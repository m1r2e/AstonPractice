package HomeWork_3.Task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 2. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых
 *    меньше средней, а также их длину.
 */

public class Task_2 {

    public static void main(String[] args) {
        final byte SIZE = 3;
        List<String> stringList = new ArrayList<>(SIZE);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < SIZE; i++) {
            stringList.add(scanner.nextLine());
        }

        int sumOfLength = 0;
        for (String string: stringList) {
            sumOfLength += string.length();
        }

        int avgLength = sumOfLength/SIZE;

        for (String string: stringList) {
            if (string.length() < avgLength)
                System.out.println(string + ", " + string.length());
        }
    }
}
