package Seminars.Seminar03.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        ar.add(16);
        ar.add(11111);
        ar.add(252);
        ar.add(1450);
        ar.add(13);
        ar.add(124);

        System.out.println(ar);

        Comparator modComparator = new SortMod();
        Collections.sort(ar, modComparator);

        System.out.println(ar);
    }

}