package lesson9.task1;

//Напишите класс BaseConverter для конвертации из градусов по Цельсию в
//Кельвины, Фаренгейты, и так далее. У класса должен быть метод convert, который
//и делает конвертацию

public class Task1 {

    public static void main(String[] args) {
        double degree = 29.7;
        Fahrenheit fahrenheit = new Fahrenheit();
        Kelvin kelvin = new Kelvin();
        System.out.printf("%.2f celsius = %.2f fahrenheit\n", degree, fahrenheit.convert(degree));
        System.out.printf("%.2f celsius = %.2f kelvin\n", degree, kelvin.convert(degree));
    }
}
