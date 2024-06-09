package homework7;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Задача1
 * Напишите программу, моделирующую поток покупателей Buyer в магазине.
 * Каждую секунду в магазин приходят от 0 до 2 новых покупателей в течение двух минут.
 * Каждый покупатель реализует интерфейс IBuyer
 * • public interface IBuyer {
 * void enterToMarket(); //вошел в магазин (мгновенно)
 * void chooseGoods(); //выбрал товар (от 0,5 до 2 секунд)
 * void goOut(); //отправился на выход(мгновенно)
 * }
 * Доработайте программу так, чтобы:
 * Каждый покупатель реализовал интерфейс IUseBasket
 * public interface IUseBasket {
 * void takeBasket(); //взял корзину
 * void putGoodsToBasket(); //положил выбранный товар в корзину
 * }
 * У каждого покупателя с корзиной (Basket) собирается набор от 1..4 товаров (Good) из
 * фиксированного списка с ценой (рекомендуется hashmap, где товар – key, цена – value).
 * Время на каждую операцию от 0,5 до 2 секунд, итог операции – в консоль.
 */

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Запуск потока, который будет генерировать новых покупателей каждую секунду в течение двух минут
        executor.submit(() -> {
            Random random = new Random();
            long endTime = System.currentTimeMillis() + 2 * 60 * 1000; // Текущее время + 2 минуты

            while (System.currentTimeMillis() < endTime) {
                int customersToGenerate = random.nextInt(3); // Генерация от 0 до 2 покупателей
                for (int i = 0; i < customersToGenerate; i++) {
                    Thread buyerThread = new Thread(new Buyer());
                    buyerThread.start();
                }

                try {
                    Thread.sleep(1000); // Подождать 1 секунду перед генерацией новых покупателей
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            executor.shutdown(); // Завершение работы ExecutorService после завершения двух минут
        });

    }
}
