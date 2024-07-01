package lesson9.task2;

public class Box extends Shape {

    private double size;

    public Box(double volume) {
        super(volume);
        this.size = volume;
    }

    public boolean add(Shape shape) {
        if (shape.getVolume() < this.size) {
            this.size -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }

}
