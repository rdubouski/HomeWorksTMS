package lesson17;

//Используя Supplier написать метод, который будет возвращать введенную с консоли
//строку задом наперед.

import java.util.Scanner;
import java.util.function.Supplier;

public class Task5 {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            Scanner scanner = new Scanner(System.in);
            StringBuilder s = new StringBuilder(scanner.nextLine());
            return s.reverse().toString();
        };
        System.out.println(supplier.get());
    }
}
