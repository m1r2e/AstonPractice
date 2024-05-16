package HomeWork_1.Task_1;

// 1. Создайте несколько классов с разными полями, конструкторами и методами.
public class Task_1 {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 2);
        dog.makeSound();

        Cat cat = new Cat("Garfield", 3);
        cat.makeSound();

        Bird bird = new Bird("Roy", 1);
        bird.makeSound();
        bird.toFly();
    }
}
