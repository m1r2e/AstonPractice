package homework2.task1;

/**
 * Задание 2.1
 * Создайте интерфейс Vehicle с методами start(), stop() и getFuelType(). Создайте абстрактный класс Car,
 * который реализует интерфейс Vehicle и добавляет следующие абстрактные методы: getNumberOfDoors()
 * и getTrunkCapacity(). Создайте два конкретных класса Sedan и Truck, которые наследуются от класса Car.
 * Реализуйте все необходимые методы в этих классах. В классе Sedan добавьте дополнительный метод
 * getLuxuryLevel(), который возвращает строку, описывающую уровень роскоши автомобиля. В классе
 * Truck добавьте дополнительный метод getMaxLoadCapacity(), который возвращает максимальную
 * грузоподъемность грузовика. Проверьте работу всех методов для созданных объектов.
 */

public class Main {

    public static void main(String[] args) {
        Sedan sedan = new Sedan("Лада Гранта", "белый", FuelType.BENZINE_95,
                LuxuryLevel.CLASSIC, 4, 500);
        System.out.println(sedan.getFuelType());
        System.out.println(sedan.getNumberOfDoors());
        System.out.println(sedan.getTrunkCapacity());
        System.out.println(sedan.getLuxuryLevel());
        System.out.println();
        System.out.println(sedan);
        sedan.start();
        sedan.stop();
        System.out.println();

        Truck truck = new Truck("Камаз", "серый", 14000, FuelType.DIESEL,
                2, 40);
        System.out.println(truck.getFuelType());
        System.out.println(truck.getNumberOfDoors());
        System.out.println(truck.getTrunkCapacity());
        System.out.println(truck.getMaxLoadCapacity());
        System.out.println();
        System.out.println(truck);
        truck.start();
        truck.stop();


    }
}
