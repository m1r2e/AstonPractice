package homework7;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Buyer implements IBuyer, IUseBasket, Runnable {

    private final int id;
    private static int generator = 1;
    private Basket basket;

    private final int numberOfGoods = ThreadLocalRandom.current().nextInt(1, 4);

    public Buyer() {
        id = generator++;
    }

    @Override
    public void enterToMarket() {
        System.out.println(this + " вошел в магазин.");
    }

    @Override
    public void takeBasket() {
        basket = new Basket();
        randomSleep();
        System.out.println(this + " взял корзину.");
    }

    @Override
    public void chooseGoods() {
        randomSleep();
        System.out.println(this + " выбрал товар.");

    }

    @Override
    public void putGoodsToBasket() {
        int randomIndex = new Random().nextInt(Market.goods.size());
        Good randomGood = (Good) Market.goods.keySet().toArray()[randomIndex];
        int randomPrice = Market.goods.get(randomGood);
        basket.addGoodsInBasket(randomGood, randomPrice);
        randomSleep();
        System.out.println(this + " положил выбранный товар \"" + randomGood.getName() + "\" в корзину.");

    }

    @Override
    public void goOut() {
        System.out.println(this + " отправился на выход.");
        System.out.println("Товары в корзине у " + this + ": " + basket);
    }

    private static void randomSleep() {
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        enterToMarket();
        takeBasket();
        for (int i = 0; i < numberOfGoods; i++) {
            chooseGoods();
            putGoodsToBasket();
        }
        goOut();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "-" + id;
    }
}
