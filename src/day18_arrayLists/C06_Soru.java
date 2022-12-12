package day18_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_Soru {

    public static void main(String[] args) {
        // Verilen bir array'deki tekrar eden elementleri silip
        // array'i unique degerlerden olusan bir array haline getirin

        int[] arr = {4,3,6,7,3,5,3,6,7,3,5,4,6,4,7,7,7,5};

        List<Integer> benzersizElementlerList=new ArrayList<>();

        // array'deki tum elementleri alip
        // listede var mi diye kontrol edelim
        // ve olmayanlari ekleyelim

        for (int i = 0; i < arr.length ; i++) {

            if (!benzersizElementlerList.contains(arr[i])){

                benzersizElementlerList.add(arr[i]);
            }
        }
        System.out.println(benzersizElementlerList);// [4, 3, 6, 7, 5]

        // soruda bu degerleri arr'ye atamamiz isteniyor

        arr= new int[benzersizElementlerList.size()]; // [0, 0, 0, 0, 0]


        for (int i = 0; i < arr.length ; i++) {

            arr[i] = benzersizElementlerList.get(i);
        }

        System.out.println("Array'in son hali : " + Arrays.toString(arr));
    }







}
