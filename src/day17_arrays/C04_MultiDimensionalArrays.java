package day17_arrays;

import java.util.Arrays;

public class C04_MultiDimensionalArrays {

    public static void main(String[] args) {

        int[][] arr={{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};

        System.out.println(arr.length); // 5
        System.out.println(arr[2].length); // 4

        System.out.println(arr[2][1]); // 7

        System.out.println(arr[3]); // [I@2752f6e2

        // Multi dimensional array ile calisirken dikkat etmemiz gereken en onemli konu
        // yazdigimiz kodun bir array mi yoksa yazdirabilecegimiz bir element mi döndürdüğüdür

        System.out.println(Arrays.toString(arr[3])); // [2]

        // 21.satirdaki 2 elemntini yazdirmak istersek

        System.out.println(arr[3][0]); // 2

    }
}
