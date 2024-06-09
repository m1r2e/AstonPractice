package homework7;

import java.util.HashMap;
import java.util.Map;

public class Basket {

    private final Map<Good, Integer> goodsInBasket;

    public Basket() {
        goodsInBasket = new HashMap<>();
    }

    public void addGoodsInBasket(Good good, int price) {
        goodsInBasket.put(good, price);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "goodsInBasket=" + goodsInBasket +
                '}';
    }
}
