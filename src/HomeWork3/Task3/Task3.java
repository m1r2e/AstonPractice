package HomeWork3.Task3;

import java.util.Scanner;

/**
 * 3. Ввести 3 строки с консоли. Найти слово, состоящее только из различных
 * символов. Если таких слов несколько, найти первое из них.
 */

public class Task3 {

    public static void main(String[] args) {
        final byte SIZE = 3;
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[SIZE];

        for (int i = 0; i < SIZE; i++) {
            strings[i] = scanner.nextLine();
        }

        boolean findUniqWord = false;
        for (int i = 0; i < SIZE && !findUniqWord; i++) {
            if (isUniqWord(strings[i])) {
                System.out.println(strings[i]);
                findUniqWord = true;
            }
        }
    }

    public static boolean isUniqWord(String string) {
        char[] chars = string.toCharArray();

        for (char ch : chars) {
            if (string.lastIndexOf(ch) != string.indexOf(ch))
                return false;
        }

        return true;
    }
}
