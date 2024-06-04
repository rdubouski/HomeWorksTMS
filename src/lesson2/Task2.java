package lesson2;

//Вывести макс и мин цифры

public class Task2 {

    public static void main(String[] args) {
        int number = 379184652;
        System.out.println("number = " + number);
        int min = number % 10;
        int max = number % 10;
        while (number != 0) {
            if (min > number % 10) {
                min = number % 10;
            }
            if (max < number % 10) {
                max = number % 10;
            }
            number /= 10;
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
