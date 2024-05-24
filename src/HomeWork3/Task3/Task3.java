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

        boolean hasFoundUniqCharsWord = false;
        for (int i = 0; i < SIZE && !hasFoundUniqCharsWord; i++) {
            String[] words = strings[i].split(" ");
            for (String word : words) {
                if (isUniqCharsWord(word)) {
                    System.out.println(word);
                    hasFoundUniqCharsWord = true;
                }
            }
        }
    }

    private static boolean isUniqCharsWord(String string) {
        char[] chars = string.toCharArray();

        for (char ch : chars) {
            if (string.lastIndexOf(ch) != string.indexOf(ch))
                return false;
        }

        return true;
    }
}
