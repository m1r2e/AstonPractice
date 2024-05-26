package homework4.task4;

public enum Subject {
    MATHEMATICS("Математика"),
    PROGRAMMING("Программирование"),
    INFORMATICS("Информатика"),
    DATABASES("Базы данных");

    private final String name;

    Subject(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}