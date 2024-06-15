package lesson4;

//Вывести все числа палиндромы в массиве

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Input element of array: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Array is: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int[] newArray;
            boolean isPalindrome = true;
            int tmp = array[i];
            int lengthNumber = 0;
            while (tmp != 0) {
                tmp /= 10;
                lengthNumber++;
            }
            tmp = array[i];
            newArray = new int[lengthNumber];
            for (int j = lengthNumber - 1; j >= 0; j--) {
                newArray[j] = tmp % 10;
                tmp /= 10;
            }
            for (int j = 0; j < newArray.length / 2; j++) {
                if (newArray[j] != newArray[newArray.length - j - 1]) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println("Palindrome = " + array[i]);
            }
        }
    }
}
