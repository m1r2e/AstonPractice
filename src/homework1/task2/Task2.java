package homework1.task2;

/**
 * 2. Практикуйтесь в использовании статических и нестатических блоков инициализации.
 */

public class Task2 {

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Non-static block");
    }

    public Task2() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Program starts");

        Task2 obj1 = new Task2();
        System.out.println("First object has been created");

        Task2 obj2 = new Task2();
        System.out.println("Second object has been created");
    }

}
