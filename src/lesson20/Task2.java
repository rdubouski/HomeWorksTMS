package lesson20;

//Сортировка массива цифр в нескольких потоках различными алгоритмами:
// сортировка вставками;
// сортировка выбором;
// сортировка пузырьком.
//Каждый вид сортировки должен запускаться в отдельном потоке. После вывести
//результат отсортированных массивов в консоль.

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println("original = " + list);

        Thread bubble = new Thread(() -> sortBubble(list));
        Thread insertion = new Thread(() -> sortInsertion(list));
        Thread selection = new Thread(() -> sortSelection(list));


        bubble.start();
        insertion.start();
        selection.start();
    }

    public synchronized static void sortBubble(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println("bubble = " + list);
    }

    public synchronized static void sortInsertion(List<Integer> list) {
        int j;
        for (int i = 0; i < list.size(); i++) {
            int swap = list.get(i);
            for (j = i; j > 0 && swap < list.get(j - 1); j--) {
                list.set(j, list.get(j - 1));
            }
            list.set(j, swap);
        }
        System.out.println("insertion = " + list);
    }

    public synchronized static void sortSelection(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int pos = i;
            int min = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < min) {
                    pos = j;
                    min = list.get(j);
                }
            }
            list.set(pos, list.get(i));
            list.set(i, min);
        }
        System.out.println("selection = " + list);
    }
}
