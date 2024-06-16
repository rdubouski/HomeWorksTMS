package lesson4;

//Выводить только те числа которые идут в порядке возрастания

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

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
            int tmp = array[i];
            int lengthNumber = 0;
            int checkLength = 1;
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
            for (int j = 0; j < newArray.length - 1; j++) {
                if (newArray[j] + 1 == newArray[j + 1]) {
                    checkLength++;
                }
            }
            if (checkLength == lengthNumber) {
                System.out.println(array[i]);
            }
        }
    }
}
