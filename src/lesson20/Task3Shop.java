package lesson20;

import java.util.concurrent.atomic.AtomicInteger;

public class Task3Shop {

    public static AtomicInteger product;

    public Task3Shop() {
        product = new AtomicInteger(0);
    }

    public void increaseProduct() {
        product.incrementAndGet();
    }

    public void decreaseProduct() {
        product.decrementAndGet();
    }

    public int getProduct() {
        return product.get();
    }

}
