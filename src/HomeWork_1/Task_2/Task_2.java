package HomeWork_1.Task_2;

/**
 * 2. Практикуйтесь в использовании статических и нестатических блоков инициализации.
 */

public class Task_2 {

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Non-static block");
    }

    public Task_2() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Program starts");

        Task_2 obj1 = new Task_2();
        System.out.println("First object has been created");

        Task_2 obj2 = new Task_2();
        System.out.println("Second object has been created");
    }

}
