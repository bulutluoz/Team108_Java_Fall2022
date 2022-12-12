package day17_arrays;

import java.util.Arrays;

public class C08_MDA {
    public static void main(String[] args) {

        //Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip,
        // yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //		input :      int[][] arr =  {{3,4,5}, {2,3,6,7}};
        //	    output:                       [5, 7, 11]


        // dinamik hale getirebilmek icin once inner array'lerden en kisa olani bulmamiz gerekir


        int[][] arr =  {{3,4,5}, {2,3,6,7}};

        int enKisaInnerArrayLength= arr[0].length;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length<enKisaInnerArrayLength){
                enKisaInnerArrayLength=arr[i].length;
            }
        }


        // ayni indexdeki elementleri topladigimizda koyacagimiz tek katli
        // bir array olusturalim
        // {{3,4,5}, {2,3,6,7},{5,6};

        int[] toplamlarArrayi = new int[enKisaInnerArrayLength];
        int toplam=0;

        for (int i = 0; i < toplamlarArrayi.length; i++) {

            for (int j = 0; j <arr.length ; j++) {

                toplam += arr[j][i];
            }

            toplamlarArrayi[i]=toplam;
            toplam=0;
        }

        System.out.println(Arrays.toString(toplamlarArrayi));
    }
}
