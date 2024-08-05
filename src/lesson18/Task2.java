package lesson18;

//Создать набор данных в формате id-name, сохраненный в Map. Необходимо отобрать из
//этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
//Среди отобранных значений отобрать только те, которые имеют нечетное количество
//букв в имени. После чего вернуть список List имен, записанных буквами задом наперед.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ivan");
        map.put(2, "Petya");
        map.put(3, "Mike");
        map.put(4, "Alex");
        map.put(5, "Bob");
        map.put(6, "Jack 1");
        map.put(7, "Jack 2");
        map.put(8, "Jack 3");
        map.put(9, "Jack 4");
        map.put(10, "Jack 5");
        map.put(11, "Jack 6");
        map.put(12, "Jack 7");
        map.put(13, "Jack 8");
        map.put(14, "Jack 9");

        List<String> list = new ArrayList<>();
        if (map.containsKey(1)) {
            list.add(map.get(1));
        }
        if (map.containsKey(2)) {
            list.add(map.get(2));
        }
        if (map.containsKey(5)) {
            list.add(map.get(5));
        }
        if (map.containsKey(8)) {
            list.add(map.get(8));
        }
        if (map.containsKey(9)) {
            list.add(map.get(9));
        }
        if (map.containsKey(13)) {
            list.add(map.get(13));
        }

        List<String> newList = list.stream().filter(s -> s.length() % 2 != 0).map(s -> new StringBuilder(s).reverse().toString()).toList();
        System.out.println(newList);

    }
}
