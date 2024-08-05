package lesson17;

//Используя Predicate среди массива чисел вывести только те, которые являются
//положительными.

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                list.add(i * -1);
            } else list.add(i);
        }
        System.out.println(list);
        Predicate<Integer> predicate = i -> i >= 0;
        for (Integer i : list) {
            if (predicate.test(i)) {
                System.out.println(i);
            }
        }
    }
}
