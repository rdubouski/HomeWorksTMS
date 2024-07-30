package lesson15;

public class MyArrayList<T> {

    private Object[] value;
    private int size;

    public MyArrayList() {
        size = 0;
        value = new Object[0];
    }

    public MyArrayList(int capacity) {
        size = 0;
        value = new Object[capacity];
    }

    public void add(T element) {
        if (value.length == size) {
            value = changeSize(value);
        }
        value[size++] = element;
    }

    public Object get(int index) {
        if (index >= size) {
            System.out.println("Нет элемента с таким индексом!");
            return null;
        }
        return value[index];
    }

    public void clear() {
        size = 0;
    }

    public boolean find(T element) {
        for (int i = 0; i < size; i++) {
            if (value[i].equals(element)) {
                return true;
            }
        }
        System.out.println("Нет такого элемента!");
        return false;
    }

    public Object remove(int index) {
        if (index >= size) {
            System.out.println("Нет элемента с таким индексом!");
            return null;
        }
        Object oldValue = value[index];
        for (int i = index; i < size - 1; i++) {
            value[i] = value[i + 1];
        }
        --size;
        return oldValue;
    }


    public Object[] changeSize(Object[] array) {
        int newSize = array.length + 10;
        Object[] newArray = new Object[newSize];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(value[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
