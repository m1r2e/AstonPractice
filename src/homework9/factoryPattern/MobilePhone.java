package homework9.factoryPattern;

public class MobilePhone implements Device {

    @Override
    public void readBook() {
        System.out.println("Read a book on ");
    }

    @Override
    public void listenMusic() {
        System.out.println("Listen to music on mobile phone...");
    }

    @Override
    public void watchVideo() {
        System.out.println("Watch video on mobile phone...");
    }
}
