package HomeWork_1.Task_4;

/* 4. Реализуйте перегрузку методов в ваших классах и попробуйте вызвать разные
      версии перегруженных методов. */

public class Task_4 {
    public static void main(String[] args) {
        calculate(10, 5);
        calculate(10, 5, 100);
        calculate(10.0, 5.0, 100);
        calculate(10, 5.0, 100.0);
    }

    public static double calculate(int num1, int num2) {
        return num1 + num2;
    }

    // перегрузка по количеству параметров:
    public static double calculate(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // перегрузка по типам параметров:
    public static double calculate(double num1, double num2, int num3) {
        return num1 + num2 + num3;
    }

    // перегрузка по порядку параметров:
    public static double calculate(int num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    //Возвращаемый тип метода не имеет значения – перегрузка методов не зависит от возвращаемого типа,
    //поэтому два метода с одинаковым именем и параметрами, но разными возвращаемыми типами, не будут считаться перегруженными.

    //Такой код высветит ошибку на этапе компиляции
    //Компилятор будет ругаться, что такой метод уже существует.

/*
    public static int calculate(int number1, int number2) {
        return number1 + number2;
    }

    public static double calculate(int number1, int number2) {
        return number1 + number2;
    }
*/



}
