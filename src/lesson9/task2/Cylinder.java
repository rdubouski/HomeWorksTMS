package lesson9.task2;

public class Cylinder extends SolidOfRevolution{

    private double height;

    public Cylinder(double height, double radius) {
        super(Math.PI * height * Math.pow(radius, 2), radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
