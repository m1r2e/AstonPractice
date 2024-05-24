package homework2.task3;

/**
 * Задание 2.3
 * Создайте класс Computer с вложенным статическим классом Processor и внутренним классом RAM. В
 * классе Processor создайте поле model и метод getDetails(), который возвращает строку с моделью
 * процессора. В классе RAM создайте поле size и метод getDetails(), который возвращает строку с
 * размером RAM.
 */

public class Computer {

    public static class Processor {

        private String model;

        public String getDetails() {
            return model;
        }

    }

    private class RAM {

        private int size;

        public int getDetails() {
            return size;
        }
    }
}
