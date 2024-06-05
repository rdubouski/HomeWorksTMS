package lesson2;

//Со * 4. Вывести цифры которые идут в стр. порядке убывания пр. 432 при 23572348357

public class Task4 {

    public static void main(String[] args) {
        long number = 912354568789L;
        System.out.println("number = " + number);
        long number2 = number / 10;
        long check = number % 10;
        long sequence = 0;
        while (number != 0) {
            while (number2 != 0){
                if ((check - 1) != number2 % 10) {
                    if (sequence != 0) {
                        sequence = sequence * 10 + check;
                        System.out.println("sequence = " + sequence);
                        number = number2;
                    }
                    break;
                } else {
                    sequence = sequence * 10 + check;
                }
                check = number2 % 10;
                number2 /= 10;
            }
            sequence = 0;
            number /= 10;
            number2 = number / 10;
            check = number % 10;
        }
    }
}
