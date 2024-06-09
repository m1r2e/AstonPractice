package homework7;

import java.util.HashMap;
import java.util.Map;

public class Market {

    public static final Map<Good, Integer> goods = new HashMap<>(Map.of(
            new Good("Хлеб"), 35,
            new Good("Молоко"), 100,
            new Good("Масло"), 300,
            new Good("Колбаса"), 200,
            new Good("Чай"), 150,
            new Good("Яйца"), 50,
            new Good("Бананы"), 120
    ));
}
