package lesson7;

public class MyArray implements NumberPrinter{

    //Вывести мин
    public int minArray(int[] array) {
        int min = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    //Вывести макс
    public int maxArray(int[] array) {
        int max = array[0];
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    //Вывести чет и не чет числа
    public void evenAndOddNumber(int[] array) {
        for (int element : array) {
            if (element % 2 == 0) {
                printNumber("even =", element);
            } else {
                printNumber("odd =", element);
            }
        }
    }

    //Вывести самое длинное и короткое число
    public void shortAndLongNumber(int[] array) {
        int count = 0;
        int tmp = array[0];
        while (tmp != 0){
            tmp /= 10;
            count++;
        }
        int[] shortNumber = {array[0], count};
        int[] longNumber = {array[0], count};
        for (int element : array) {
            count = 0;
            tmp = element;
            while (tmp != 0) {
                tmp /= 10;
                count++;
            }
            if (shortNumber[1] > count) {
                shortNumber[0] = element;
                shortNumber[1] = count;
            }
            if (longNumber[1] < count) {
                longNumber[0] = element;
                longNumber[1] = count;
            }
        }
        printNumber("Short number =", shortNumber[0]);
        printNumber("Long number =", longNumber[0]);
    }

    //Выводить только те числа которые идут в порядке возрастания
    public void checkIncrease(int[] array) {
        String check = "123456789";
        for (int element : array) {
            if (check.contains(String.valueOf(element))){
                printNumber("Increase =", element);
            }
        }
    }

    //Вывести все числа палиндромы в массиве
    public void checkPalindrome(int[] array) {
        MyNumber check = new MyNumber();
        for (int element : array) {
            int saveElement = element;
            int reverse = check.reverse(element);
            boolean isPalindrome = false;
            while (element != 0) {
                if ((element % 10) != (reverse % 10)) {
                    isPalindrome = false;
                    break;
                } else {
                    isPalindrome = true;
                }
                element /= 10;
                reverse /= 10;
            }
            if (isPalindrome) {
                printNumber("Palindrome =", saveElement);
            }
        }
    }

    @Override
    public void printNumber(String text, int value) {
        System.out.println(text + " " + value);
    }
}
