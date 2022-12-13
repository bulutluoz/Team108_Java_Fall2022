package day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C07_ForEachLoopSoru {
    public static void main(String[] args) {
        //Soru 5- Verilen iki array’in elementlerini karsilastirip,
        // ikisinde ortak olan elementleri ayri bir liste olarak veren bir program yazin.

        int[] arr1 = {3,5,6,1,3,7};
        int[] arr2 = {3,8,9,4,5,11};

        List<Integer> ortakElementler= new ArrayList<>();


        for (int eachArr1: arr1
             ) {
            for (int eachArr2: arr2
                 ) {

                if (eachArr1==eachArr2){

                    if (!ortakElementler.contains(eachArr1)){
                        ortakElementler.add(eachArr1);
                    }
                }

            }
        }

        System.out.println(ortakElementler);
    }
}
