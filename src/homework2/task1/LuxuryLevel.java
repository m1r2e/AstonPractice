package homework2.task1;

public enum LuxuryLevel {

    BASIC("Базовый"),
    CLASSIC("Средний"),
    LUX("Максимальный");

    private final String name;

    LuxuryLevel(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
