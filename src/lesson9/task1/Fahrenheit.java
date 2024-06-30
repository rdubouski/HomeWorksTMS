package lesson9.task1;

public class Fahrenheit implements BaseConverter{

    @Override
    public double convert(double degree) {
        return degree * 1.8 + 32;
    }
}
