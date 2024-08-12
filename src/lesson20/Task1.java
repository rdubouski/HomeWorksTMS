package lesson20;

//Пользователь вводит с клавиатуры значение в массив. После чего запускаются два
//потока. Первый поток находит максимум в массиве, второй — минимум. Результаты
//вычислений возвращаются в метод main().

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter a number: ");
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }

        Thread findMin = new Thread(() -> System.out.println("min = " + min(list)));
        Thread findMax = new Thread(() -> System.out.println("max = " + max(list)));

        findMin.start();
        findMax.start();

    }

    public static int min(List<Integer> list) {
        int min = list.getFirst();
        for (int i = 1; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static int max(List<Integer> list) {
        int max = list.getFirst();
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }
}
