package day18_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C08_equals {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);

        List<Integer> list2 = new ArrayList<>();

        list2.add(20);
        list2.add(10);

        System.out.println(list1.equals(list2)); // false

        List<Integer> list3 = new ArrayList<>();

        list3.add(20);
        list3.add(10);

        System.out.println(list2.equals(list3)); // true


    }
}
