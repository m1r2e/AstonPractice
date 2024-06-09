package homework7;

public class Good {

    private final String name;

    public Good(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Good{" +
                "name='" + name + '\'' +
                '}';
    }
}
