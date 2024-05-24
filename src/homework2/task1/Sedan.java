package homework2.task1;

public class Sedan extends Car {
    private FuelType fuelType;
    private LuxuryLevel luxuryLevel;

    public Sedan(String model, String color) {
        super(model, color);
    }

    public Sedan(String model, String color, FuelType fuelType, LuxuryLevel luxuryLevel, int numberOfDoors, int trunkCapacity) {
        super(model, color);
        this.fuelType = fuelType;
        this.luxuryLevel = luxuryLevel;
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
    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public LuxuryLevel getLuxuryLevel() {
        return luxuryLevel;
    }

    public void setLuxuryLevel(LuxuryLevel luxuryLevel) {
        this.luxuryLevel = luxuryLevel;
    }

    @Override
    public void start() {
        System.out.println("Автомобиль " + super.getModel() + ", цвет " + super.getColor() + " поехал...");
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль " + super.getModel() + ", цвет " + super.getColor() + " остановился.");
    }

    @Override
    public String toString() {
        return "Автомомбиль" +
                "\nМодель: " + super.getModel() +
                "\nЦвет: " + super.getColor() +
                "\nУровень комплектации: " + luxuryLevel +
                "\nТип топлива: " + fuelType +
                "\nКоличество дверей: " + numberOfDoors +
                "\nВместимость багажника: " + trunkCapacity + " л." +
                '\n';
    }
}
