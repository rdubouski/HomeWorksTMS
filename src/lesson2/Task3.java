package lesson2;

//Вывести true если в числе нет цифр дубликатов

public class Task3 {

    public static void main(String[] args) {
        int number = 123456789;
        System.out.println("number = " + number);
        int number2 = number / 10;
        int check = number % 10;
        boolean checkunique = true;
        while (number != 0) {
            while (number2 != 0){
                if (check == number2 % 10) {
                    checkunique = false;
                    System.out.println(checkunique);
                    return;
                }
                number2 /= 10;
            }
            number /= 10;
            number2 = number / 10;
            check = number % 10;
        }
        System.out.println(checkunique);
    }
}
