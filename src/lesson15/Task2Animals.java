package lesson15;

import java.util.ArrayDeque;
import java.util.Deque;

public class Task2Animals {

    Deque<String> animals = new ArrayDeque<>();

    public Task2Animals() {
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Tiger");
    }

    public void add(String name) {
        this.animals.addFirst(name);
    }

    public void del() {
        this.animals.removeLast();
    }

    @Override
    public String toString() {
        return "Task2Animals{" +
                "animals=" + animals +
                '}';
    }
}
