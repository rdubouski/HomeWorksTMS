package lesson15;

import java.util.ArrayList;
import java.util.List;

public class Task3Student {

    String name;
    String group;
    int course;
    List<Integer> ratings = new ArrayList<>();

    public Task3Student(String name, String group, int course, List<Integer> ratings) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.ratings = ratings;
    }

    public double getAVGRatings() {
        int sum = 0;
        for (Integer rating : this.ratings) {
            sum += rating;
        }
        return (double) sum / this.ratings.size();
    }

    public void setCourse() {
        this.course += 1;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", ratings=" + ratings + "\n";
    }
}
