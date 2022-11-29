package Seminars.Seminar03.src;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1:");
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
        System.out.println("");

        System.out.println("Задача 2:");

        MyCollections col = new MyCollections();
        col.set(10);
        col.set(12);

        for(int i : col){
            System.out.println(col.get(i));
        }


    }

}