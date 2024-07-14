package lesson11;

//Дана строка произвольной длины с произвольными словами. Написать программу для
//проверки является ли любое выбранное слово в строке палиндромом.
//Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е
//слово в этой строке палиндромом.
//Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например,
//в строке 5 слов, а на вход программе передали число 500.

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.print("Input string: ");
        string = scanner.nextLine();
        String[] words = string.split(" ");

        int number = 0;
        boolean checkCorrect = false;
        while (!checkCorrect) {
            System.out.print("Input number: ");
            number = scanner.nextInt();
            if (number < 0 || number >= words.length) {
                System.out.println("Incorrect input! Try again!");
            } else {
                checkCorrect = true;
            }
        }

        boolean isPalindrome = true;
        char[] cWords = words[number].toCharArray();
        for (int i = 0; i < cWords.length / 2; i++) {
            if (cWords[i] != cWords[cWords.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome: " + words[number]);
        } else {
            System.out.println("Not palindrome: " + words[number]);
        }

    }
}
