package homework2.task1;

public class Truck extends Car {

    private int maxLoadCapacity;

    FuelType fuelType;

    public Truck(String model, String color) {
        super(model, color);
    }

    public Truck(String model, String color, int maxLoadCapacity, FuelType fuelType, int numberOfDoors, int trunkCapacity) {
        super(model, color);
        this.maxLoadCapacity = maxLoadCapacity;
        this.fuelType = fuelType;
        super.numberOfDoors = numberOfDoors;
        super.trunkCapacity = trunkCapacity;
    }

    @Override
    public int getNumberOfDoors() {
        return super.numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        super.numberOfDoors = numberOfDoors;
    }

    @Override
    public int getTrunkCapacity() {
        return super.trunkCapacity;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        super.trunkCapacity = trunkCapacity;
    }

    @Override
    public void start() {
        System.out.println("Грузовик " + super.getModel() + ", цвет " + super.getColor() + " поехал...");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик " + super.getModel() + ", цвет " + super.getColor() + " остановился.");
    }

    @Override
    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public void setMaxLoadCapacity(int maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public String toString() {
        return "Грузовик" +
                "\nМодель: " + super.getModel() +
                "\nЦвет: " + super.getColor() +
                "\nМаксимальная грузоподъёмность: " + maxLoadCapacity + " кг." +
                "\nТип топлива: " + fuelType +
                "\nКоличество дверей: " + numberOfDoors +
                "\nВместимость кузова: " + trunkCapacity + " л." +
                '\n';
    }
}
