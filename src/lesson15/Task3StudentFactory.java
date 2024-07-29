package lesson15;

import java.util.ArrayList;
import java.util.List;

public class Task3StudentFactory {

    List<Task3Student> students = new ArrayList<>();

    public void add(Task3Student student) {
        students.add(student);
    }

    public void del() {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAVGRatings() < 3) {
                students.remove(i);
            } else {
                students.get(i).setCourse();
            }
        }
    }

    @Override
    public String toString() {
        return students.toString();
    }

    public void printStudents(int course) {
        System.out.printf("Student in %d course:\n", course);
        for (Task3Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
