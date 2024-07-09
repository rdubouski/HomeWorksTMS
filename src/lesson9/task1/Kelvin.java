package lesson9.task1;

public class Kelvin implements Converter{

    @Override
    public double convert(double degree) {
        return degree + 273.15;
    }
}
