package HomeWork1.Task1;

public class Bird extends Animal implements AbleToFly {

    public Bird() {

    }

    public Bird(String name) {
        super(name);
    }

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void toFly() {
        System.out.println("Bird is flying.");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird is chirping.");
    }
}
