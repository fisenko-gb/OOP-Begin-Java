package Seminars.Seminar03.src;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

class MyCollections implements Iterable<Integer> {
    private int[] array = new int[10];
    private int size = 0;

    public void set(int n) {
        array[size] = n;
        size++;
        if (size == array.length) {
            int[] newArray = new int[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public int get(int index) {
        return array[index];
    }

    @Override
    public Iterator iterator() {
        return new MyIterator(0, size - 1);
    }

}
