package lesson20;

public class Task3Producer {

    public synchronized void add(Task3Shop shop) {
        while (shop.getProduct() >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        shop.increaseProduct();
        System.out.println("Add 1 product");
        System.out.println("Product = " + shop.getProduct());
        notify();
    }
}
