package Seminars.Seminar03.src;

import java.util.Comparator;

public class SortMod implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1 % 10) - (o2 % 10);
    }
}
