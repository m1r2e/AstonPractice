package homework3.task1;

import java.util.Scanner;

/**
 * 1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
 *    Вывести найденные строки и их длину.
 */

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        String shortStr = getShortStr(str1, str2, str3);
        String longStr = getLongStr(str1, str2, str3);

        System.out.println("Самая короткая строка: " + shortStr + "; длина строки: " + shortStr.length());
        System.out.println("Самая длинная строка: " + longStr + "; длина строки: " + longStr.length());
    }

    private static String getShortStr(String str1, String str2, String str3) {
        if (str1.length() < str2.length() && str1.length() < str3.length())
            return str1;
        else if (str2.length() < str1.length() && str2.length() < str3.length())
            return str2;
        else return str3;
    }

    private static String getLongStr(String str1, String str2, String str3) {
        if (str1.length() > str2.length() && str1.length() > str3.length())
            return str1;
        else if (str2.length() > str1.length() && str2.length() > str3.length())
            return str2;
        else return str3;
    }

}
