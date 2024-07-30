package lesson15;

//Представим, что в Java нет коллекции типа ArrayList. Создать свой класс, симулирующий
//работу класса динамической коллекции - т.е. создать свою кастомную коллекцию. В
//основе коллекции будет массив. Кастомная коллекция должна хранить элементы разных
//классов(т.е. это generic).
//Предусмотреть операции(методы):
//- добавления элемента
//- удаления элемента
//- получение элемента по индексу
//- проверка есть ли элемент в коллекции
//- очистка всей коллекции
//Предусмотреть конструктор без параметров - создает массив размером
//по умолчанию. Предусмотреть конструктор с задаваемым размером внутреннего
//массива. Предусмотреть возможность автоматического расширения коллекции при
//добавлении элемента в том случае, когда коллекция уже заполнена


public class Task4 {

    public static void main(String[] args) {

        MyArrayList<Integer> myInteger = new MyArrayList<>();
        MyArrayList<String> myString = new MyArrayList<>(10);
        myInteger.add(10);
        myInteger.add(20);
        myInteger.add(30);
        myInteger.add(40);
        myInteger.add(50);
        myInteger.add(60);
        myInteger.add(70);
        myInteger.add(80);
        myInteger.add(90);
        myInteger.add(100);
        System.out.println(myInteger.get(1));
        System.out.println(myInteger.remove(2));
        System.out.println(myInteger.find(40));
        System.out.println(myInteger);
        myInteger.clear();
        System.out.println(myInteger);

        myString.add("Hello");
        myString.add("World");
        System.out.println(myString);


    }
}
