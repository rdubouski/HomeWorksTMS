package lesson11;

//Вывести на консоль новую строку, которой задублирована каждая буква из
//начальной строки. Например, "Hello" -> "HHeelllloo".

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.print("Input string: ");
        string = scanner.nextLine();
        char[] cString = string.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char tmp : cString) {
            builder.append(tmp);
            builder.append(tmp);
        }
        String result = builder.toString();
        System.out.println("Double string: " + result);
    }
}
