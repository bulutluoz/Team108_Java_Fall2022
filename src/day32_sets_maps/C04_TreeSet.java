package day32_sets_maps;

import java.util.Set;
import java.util.TreeSet;

public class C04_TreeSet {

    public static void main(String[] args) {

        Set<Integer> sirali= new TreeSet<>();

        sirali.add(13);
        sirali.add(34);
        sirali.add(1);
        sirali.add(3);
        sirali.add(25);

        System.out.println(sirali); // [1, 3, 13, 25, 34]


    }
}
