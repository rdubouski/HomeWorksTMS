package lesson18;

//Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
//Stream'ов:
//Удалить дубликаты
//Оставить только четные элементы
//Вывести сумму оставшихся элементов в стриме

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(3);
        list.add(9);
        list.add(5);

        list.stream().distinct().filter(i -> i % 2 == 0).reduce(Integer::sum).ifPresent(System.out::println);
    }
}
