package HomeWork_1.Task_1;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }
}
