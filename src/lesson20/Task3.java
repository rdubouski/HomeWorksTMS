package lesson20;

//Имеются сущности Магазин, Производитель, Покупатель. Цель задачи сделать так чтобы
//производитель произвел 5 единиц продукта, а покупатель их купил. Пока производитель
//не произвел продукт, покупатель не может его купить. При этом одновременно в магазине
//может находиться не более 3 товаров

public class Task3 {

    public static void main(String[] args) {

        Task3Shop shop = new Task3Shop();

        Task3Producer producer = new Task3Producer();
        Thread thread1 = new Thread(() -> {
            for (int j = 0; j < 5; j++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                producer.add(shop);
            }
        });
        thread1.start();

        Task3Buyer buyer = new Task3Buyer();
        Thread thread2 = new Thread(() -> {
            for (int j = 0; j < 5; j++) {
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                buyer.get(shop);
            }
        });
        thread2.start();

    }
}