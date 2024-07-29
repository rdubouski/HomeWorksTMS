package lesson15;

//Создать класс, который будет хранить в себе коллекцию с названиями животных.
//Реализовать методы удаления и добавления животных по следующим правилам:
//добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
//объекта этого класса в main методе другого класса.

public class Task2 {

    public static void main(String[] args) {

        Task2Animals animals = new Task2Animals();
        System.out.println(animals);
        animals.add("Lion");
        animals.del();
        System.out.println(animals);
    }
}
