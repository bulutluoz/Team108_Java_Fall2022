package day18_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C09_indexOf {

    public static void main(String[] args) {
        List<String> harfler= new ArrayList<>();

        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        System.out.println(harfler); // [A, Z, T]

        System.out.println(harfler.indexOf("Z")); // 1

        System.out.println(harfler.lastIndexOf("Z")); // 1

        harfler.add("Z");
        System.out.println(harfler); // [A, Z, T, Z]

        System.out.println(harfler.indexOf("Z")); // 1

        System.out.println(harfler.lastIndexOf("Z")); // 3

        System.out.println(harfler.indexOf("M")); // -1
        System.out.println(harfler.lastIndexOf("M")); // -1


    }
}
