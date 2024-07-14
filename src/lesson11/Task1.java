package lesson11;

//Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
//найденные строки и их длину.

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        int min = Integer.MAX_VALUE;
        int max = 0;
        String minString = "";
        String maxString = "";

        for (int i = 0; i < 3; i++) {
            System.out.print("Input string: ");
            strings[i] = scanner.nextLine();
        }

        for (String tmp : strings) {
            if (tmp.length() < min) {
                minString = tmp;
                min = tmp.length();
            }
            if (tmp.length() > max) {
                maxString = tmp;
                max = tmp.length();
            }
        }

        System.out.printf("Min string = %s\n", minString);
        System.out.printf("Max string = %s\n", maxString);
    }
}
