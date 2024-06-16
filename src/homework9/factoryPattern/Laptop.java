package homework9.factoryPattern;

public class Laptop implements Device {

    @Override
    public void readBook() {
        System.out.println("Read a book on laptop...");
    }

    @Override
    public void listenMusic() {
        System.out.println("Listen to music on laptop...");
    }

    @Override
    public void watchVideo() {
        System.out.println("Watch video on laptop...");
    }
}
