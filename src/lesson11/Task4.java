package lesson11;

//Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
//Если таких слов несколько, найти первое из них.

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Input string: ");
            strings[i] = scanner.nextLine();
        }

        boolean isUniq;
        for (String tString : strings) {
            String[] words = tString.split(" ");
            for (String tWords : words) {
                isUniq = true;
                char[] cWords = tWords.toCharArray();
                for (int i = 0; i < cWords.length - 1; i++) {
                    for (int j = i + 1; j < cWords.length; j++) {
                        if (cWords[i] == cWords[j]) {
                            isUniq = false;
                            break;
                        }
                    }
                }
                if (isUniq) {
                    System.out.println("Uniq word = " + tWords);
                }
            }
        }
    }
}
