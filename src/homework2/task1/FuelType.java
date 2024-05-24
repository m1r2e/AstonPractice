package homework2.task1;

public enum FuelType {

    BENZINE_98("АИ-98"),
    BENZINE_95("АИ-95"),
    BENZINE_92("АИ-92"),
    GAS("Газ"),
    DIESEL("ДТ");

    private final String name;

    FuelType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
