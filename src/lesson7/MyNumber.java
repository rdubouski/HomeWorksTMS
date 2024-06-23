package lesson7;

public class MyNumber implements NumberPrinter{

    //Вывести число в обратном порядке
    public int reverse(int number) {
        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }
        return result;
    }

    //Вывести мин
    public int checkMin(int number) {
        int min = number % 10;
        while (number != 0) {
            if (min > number % 10) {
                min = number % 10;
            }
            number /= 10;
        }
        return min;
    }

    //Вывести макс
    public int checkMax(int number) {
        int max = number % 10;
        while (number != 0) {
            if (max < number % 10) {
                max = number % 10;
            }
            number /= 10;
        }
        return max;
    }

    //Вывести true если в числе нет цифр дубликатов
    public boolean checkUnique(int number) {
        int number2 = number / 10;
        int check = number % 10;
        while (number != 0) {
            while (number2 != 0){
                if (check == number2 % 10) {
                    return false;
                }
                number2 /= 10;
            }
            number /= 10;
            number2 = number / 10;
            check = number % 10;
        }
        return true;
    }

    //Со * 4. Вывести цифры которые идут в стр. порядке убывания пр. 432 при 23572348357
    public void checkSequence(int number){
        int sequence = 0;
        while (number != 0){
            if (number % 10 + 1 == sequence % 10) {
                sequence = sequence * 10 + number % 10;
            } else {
                printSequence(sequence);
                sequence = number % 10;
            }
            number /= 10;
        }
        printSequence(sequence);
    }

    public void printSequence(int sequence) {
        if (sequence / 10 > 0) {
            printNumber("sequence =", sequence);
        }
    }

    @Override
    public void printNumber(String text, int value) {
        System.out.println(text + " " + value);
    }
}
