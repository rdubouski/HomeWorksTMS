package lesson15;

//Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
//4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
//При решении использовать коллекции.

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input numbers: ");
        String string = scanner.nextLine();
        String[] split = string.split(", ");

        Set<Integer> numbers = new TreeSet<>();

        for (String num : split) {
            numbers.add(Integer.valueOf(num));
        }

        System.out.println(numbers);
    }
}
