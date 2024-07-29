package lesson16;

//На вход поступает массив непустых строк, создайте и верните Map<String,
//String> следующим образом: для каждой строки добавьте ее первый символ в
//качестве ключа с последним символом в качестве значения. Пример:
//pairs(["code", "bug"]) → {"b": "g", "c": "e"}
//pairs(["man", "moon", "main"]) → {"m": "n"}
//pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task2 {

    public static void main(String[] args) {

        Map<String, String> myMap;
        myMap = pairs(new ArrayList<>(Arrays.asList("code", "bug")));
        System.out.println(myMap);
        myMap = pairs(new ArrayList<>(Arrays.asList("man", "moon", "main")));
        System.out.println(myMap);
        myMap = pairs(new ArrayList<>(Arrays.asList("man", "moon", "good", "night")));
        System.out.println(myMap);

    }

    public static Map<String, String> pairs(ArrayList<String> string) {
        Map<String, String> map = new HashMap<>();

        for (String s : string) {
            String first = String.valueOf(s.charAt(0));
            String last = String.valueOf(s.charAt(s.length() - 1));
            map.put(first, last);
        }
        return map;
    }
}
