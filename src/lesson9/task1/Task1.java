package lesson9.task1;

//Напишите класс BaseConverter для конвертации из градусов по Цельсию в
//Кельвины, Фаренгейты, и так далее. У класса должен быть метод convert, который
//и делает конвертацию

public class Task1 {

    public static void main(String[] args) {
        BaseConverter converter = new BaseConverter();
        double degree = 29.7;
        Converter fahrenheit = new Fahrenheit();
        Converter kelvin = new Kelvin();
        System.out.printf("%.2f celsius = %.2f fahrenheit\n", degree, converter.convert(degree, fahrenheit));
        System.out.printf("%.2f celsius = %.2f kelvin\n", degree, converter.convert(degree, kelvin));
    }
}
