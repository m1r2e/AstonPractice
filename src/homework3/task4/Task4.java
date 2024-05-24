package homework3.task4;

/**
 * 4. Вывести на консоль новую строку, которой задублирована каждая буква из
 * начальной строки. Например, "Hello" -> "HHeelllloo".
 */

public class Task4 {

    public static void main(String[] args) {
        System.out.println(doubleChar("Hello"));
        System.out.println(doubleChar("world"));
    }

    private static String doubleChar(String s) {
        StringBuilder doubleCharString = new StringBuilder();
        char[] chars = s.toCharArray();

        for (char ch : chars) {
            doubleCharString.append(String.valueOf(ch).repeat(2));
        }

        return doubleCharString.toString();
    }
}
