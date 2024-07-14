package lesson11;

//Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
//средней, а также их длину.

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        int avg = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Input string: ");
            strings[i] = scanner.nextLine();
        }

        for (String tmp : strings) {
            avg += tmp.length();
        }
        avg /= strings.length;

        System.out.println("avg = " + avg);

        for (String tmp : strings) {
            if (tmp.length() < avg) {
                System.out.printf("String = %s, length = %d\n", tmp, tmp.length());
            }
        }
    }
}
