package day18_arrayLists;

import day16_arrays.C10_ArrayeBirElementEkleme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {

    public static void main(String[] args) {

        String[] arr ={"A","B","T"};

        // bu array'e element olarak C eklemek istersek
        arr= C10_ArrayeBirElementEkleme.arrayeElementEkleme(arr,"C");

        System.out.println(Arrays.toString(arr)); // [A, B, T, C]


        // ArrayList esnek uzunluktaki bir array'dir
        // Ancak ArrayList, array altyapisini kullandigindan
        // elementleri sadece tek tek ekleyebiliriz

        List<String> harfler= new ArrayList<>();

        System.out.println(harfler); // []
        harfler.add("A");
        harfler.add("B");
        harfler.add("K");

        System.out.println(harfler); // [A, B, K]

        harfler.add(1,"C");

        System.out.println(harfler); // [A, C, B, K] B ile K arasina D ekleyelim

        harfler.add(3,"D"); // [A, C, B, D, K]

        List<String> karakterler= new ArrayList<>();
        karakterler.add("*");
        karakterler.add("#");

        harfler.addAll(karakterler);

        System.out.println(harfler); // [A, C, B, D, K, *, #]

        harfler.addAll(2,karakterler);

        System.out.println(harfler); // [A, C, *, #, B, D, K, *, #]


    }
}
