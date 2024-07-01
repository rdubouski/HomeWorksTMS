package lesson9.task2;

//Реализуйте иерархию классов:
//
//Класс Box является контейнером, он можем содержать в себе другие фигуры.
//Метод add() принимает на вход Shape. Нужно добавлять новые фигуры до тех пор,
//пока для них хватаем места в Box (будем считать только объём, игнорируя форму.
//Допустим, мы переливаем жидкость). Если места для добавления новой фигуры не хватает,
//то метод должен вернуть false.

public class Task2 {

    public static void main(String[] args) {
        Ball ball = new Ball(2);
        Cylinder cylinder = new Cylinder(2, 2);
        Pyramid pyramid =  new Pyramid(5, 5);
        Box box = new Box(50);

        System.out.println(box.add(ball));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(pyramid));
        System.out.println(box.add(pyramid));
    }
}
