package homework6.task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Задача 2:
 * Используя FileOutputStream и FileInputStream записать в файл tms.txt строку, введенную
 * пользователем с консоли. Считать строку из файла tms.txt и вывести в консоль, заменив
 * все пробелы на знак нижнего подчеркивания.
 */

public class Task2 {

    public static void main(String[] args) throws IOException {
        File file = writeFile(userInput());
        System.out.println(replaceSpacesWithUnderscores(readFile(file)));
    }

    private static String userInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static File writeFile(String userInput) {
        File file = Path.of("resources", "tms.txt").toFile();
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(userInput.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return file;
    }

    private static String readFile(File file) {
        try (FileInputStream fis = new FileInputStream(file)) {
            return new String(fis.readAllBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String replaceSpacesWithUnderscores(String input) {
        return input.replaceAll(" ", "_");
    }
}
