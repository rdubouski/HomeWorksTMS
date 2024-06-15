package lesson4;

//Вывести самое длинное и короткое число

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

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
        int count = 0;
        int tmp = array[0];
        while (tmp != 0){
            tmp /= 10;
            count++;
        }
        int[] shortNumber = {array[0], count};
        int[] longNumber = {array[0], count};
        for (int i = 0; i < array.length; i++) {
            count = 0;
            tmp = array[i];
            while (tmp != 0) {
                tmp /= 10;
                count++;
            }
            if (shortNumber[1] > count) {
                shortNumber[0] = array[i];
                shortNumber[1] = count;
            }
            if (longNumber[1] < count) {
                longNumber[0] = array[i];
                longNumber[1] = count;
            }
        }
        System.out.println("Short number = " + shortNumber[0]);
        System.out.println("Long number = " + longNumber[0]);
    }
}
