package lesson17;

//Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
//когда пользователю исполнится 100 лет. Использовать Date/Time API.

import java.time.LocalDate;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a date(yyyy-MM-dd): ");
        String date = sc.nextLine();

        LocalDate birthDate = LocalDate.parse(date);
        System.out.println(birthDate.plusYears(100));
    }
}
