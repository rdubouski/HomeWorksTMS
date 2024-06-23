package lesson7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task {

    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber();
        int number = 235723483;
        myNumber.printNumber("number =", number);
        myNumber.printNumber("reverse =", myNumber.reverse(number));
        myNumber.printNumber("min =", myNumber.checkMin(number));
        myNumber.printNumber("man =", myNumber.checkMax(number));
        System.out.println("unique = " + myNumber.checkUnique(number));
        myNumber.checkSequence(number);

        System.out.println();
        MyArray myArray = new MyArray();
        int size = 5;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        System.out.println("Array is: " + Arrays.toString(array));
        myArray.printNumber("min =", myArray.minArray(array));
        myArray.printNumber("max =", myArray.maxArray(array));
        myArray.evenAndOddNumber(array);
        myArray.shortAndLongNumber(array);
        myArray.checkIncrease(array);
        myArray.checkPalindrome(array);
    }
}
