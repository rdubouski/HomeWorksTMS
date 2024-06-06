package lesson2;

//Со * 4. Вывести цифры которые идут в стр. порядке убывания пр. 432 при 23572348357

public class Task4 {

    public static void main(String[] args) {
        long number = 23572348357L;
        System.out.println("number = " + number);
        long sequence = 0;
        while (number != 0){
            if (number % 10 + 1 == sequence % 10) {
                sequence = sequence * 10 + number % 10;
            } else {
                if (sequence / 10 > 0) {
                    System.out.println("sequence = " + sequence);
                }
                sequence = number % 10;
            }
            number /= 10;
        }
        if (sequence / 10 > 0) {
            System.out.println("sequence = " + sequence);
        }
    }
}
