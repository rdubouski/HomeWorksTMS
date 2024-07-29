package lesson16;

//На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
//строка является ключом, и ее значение равно true, если эта строка встречается в массиве
//2 или более раз. Пример:
//wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
//wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
//wordMultiple(["c", "c", "c", "c"]) → {"c": true}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {

        Map<String, Boolean> myMap;
        myMap = wordMultiple(new ArrayList<>(Arrays.asList("a", "b", "a", "c", "b")));
        System.out.println(myMap);
        myMap = wordMultiple(new ArrayList<>(Arrays.asList("c", "b", "a")));
        System.out.println(myMap);
        myMap = wordMultiple(new ArrayList<>(Arrays.asList("c", "c", "c", "c")));
        System.out.println(myMap);

    }

    public static Map<String, Boolean> wordMultiple(ArrayList<String> string) {

        Map<String, Boolean> map = new HashMap<>();

        for (String s : string) {
            if (!map.containsKey(s)) {
                map.put(s, false);
            } else {
                map.put(s, true);
            }
        }
        return map;
    }
}
