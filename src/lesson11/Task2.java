package lesson11;

//Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
//значений их длины.

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Input string: ");
            strings[i] = scanner.nextLine();
        }

        for (int i = strings.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (strings[j].length() > strings[j + 1].length()) {
                    String tmp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.deepToString(strings));
    }
}
