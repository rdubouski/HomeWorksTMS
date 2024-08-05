package lesson17;

//Используя Function реализовать лямбду, которая будет принимать в себя строку в
//формате “сумма BYN”(через пробел, вместо сумма вставить любое значение), а
//возвращать сумму, переведенную сразу в доллары.

import java.util.function.Function;

public class Task3 {

    public static void main(String[] args) {

        String string = "15 BYN";
        double usd = 3.14;
        Function<String, Double> convert = s -> Integer.parseInt(s.split(" ")[0]) / usd;

        System.out.println(convert.apply(string));

    }
}
