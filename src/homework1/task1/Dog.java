package homework1.task1;

public class Dog extends Animal {

    public Dog() {

    }

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog is barking.");
    }

}
