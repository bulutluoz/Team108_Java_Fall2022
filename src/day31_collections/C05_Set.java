package day31_collections;

import java.util.Set;
import java.util.TreeSet;

public class C05_Set {

    public static void main(String[] args) {
        // Set index yapisini desteklemez

        Set<String> ogrenciler = new TreeSet<>();

        ogrenciler.add("Esra");
        ogrenciler.add("Ayten");
        ogrenciler.add("Furkan");

        System.out.println(ogrenciler); // [Ayten, Esra, Furkan]

        ogrenciler.add("Ahmet");
        System.out.println(ogrenciler); // [Ahmet, Ayten, Esra, Furkan]

        ogrenciler.add("Furkan");
        System.out.println(ogrenciler); // [Ahmet, Ayten, Esra, Furkan]

    }
}
