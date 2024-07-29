package lesson15;

//Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
//оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
//Написать метод, который удаляет студентов со средним баллом <3. Если средний
//балл>=3, студент переводится на следующий курс. Дополнительно написать метод
//printStudents(List<Student> students, int course), который получает список студентов и
//номер курса. А также печатает на консоль имена тех студентов из списка, которые
//обучаются на данном курсе.

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {

        Task3StudentFactory studentFactory = new Task3StudentFactory();
        studentFactory.add(new Task3Student("Ivan1", "30-Onl", 1, new ArrayList<>(Arrays.asList(1, 2, 3))));
        studentFactory.add(new Task3Student("Ivan2", "31-Onl", 2, new ArrayList<>(Arrays.asList(3, 4, 5))));
        studentFactory.add(new Task3Student("Ivan3", "30-Onl", 3, new ArrayList<>(Arrays.asList(3, 4, 5))));
        studentFactory.add(new Task3Student("Ivan4", "31-Onl", 4, new ArrayList<>(Arrays.asList(1, 2, 3))));
        studentFactory.add(new Task3Student("Ivan5", "30-Onl", 3, new ArrayList<>(Arrays.asList(3, 4, 5))));

        System.out.println(studentFactory);
        studentFactory.printStudents(3);
        studentFactory.del();
        System.out.println(studentFactory);
        studentFactory.printStudents(2);

    }
}
