package lesson20;

public class Task3Buyer {

    public synchronized void get(Task3Shop shop) {
        while (shop.getProduct() < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        shop.decreaseProduct();
        System.out.println("Get 1 product");
        System.out.println("Product = " + shop.getProduct());
        notify();
    }
}
