package lesson17;

//Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
//формате “сумма BYN”(через пробел, вместо сумма вставить любое значение), а
//выводить сумму, переведенную сразу в доллары.

import java.util.function.Consumer;

public class Task4 {

    public static void main(String[] args) {

        String string = "15 BYN";
        double usd = 3.14;
        Consumer<String> convert = s -> System.out.printf("%.2f USD", Integer.parseInt(s.split(" ")[0]) / usd);

        convert.accept(string);
    }
}
