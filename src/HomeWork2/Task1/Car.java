package HomeWork2.Task1;

public abstract class Car implements Vehicle {

    private String model;
    private String color;
    private int maxSpeed;
    protected int numberOfDoors;
    protected int trunkCapacity;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public abstract int getNumberOfDoors();

    public abstract int getTrunkCapacity();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
