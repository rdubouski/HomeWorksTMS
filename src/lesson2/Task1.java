package lesson2;

//Вывести число в обратном порядке

public class Task1 {

    public static void main(String[] args) {
        int number = 12345;
        int result = 0;
        System.out.println("number = " + number);
        while (number != 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }
        System.out.println("reverse = " + result);
    }
}
