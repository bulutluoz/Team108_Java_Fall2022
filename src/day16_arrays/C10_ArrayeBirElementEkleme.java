package day16_arrays;

import java.util.Arrays;

public class C10_ArrayeBirElementEkleme {
    public static void main(String[] args) {

        // Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        // eski array’e yeni degeri atayin.

        String[] isimler={"Ali","Veli","Cem"};
        String eklenecekIsim="Kemal";
        isimler=arrayeElementEkleme(isimler,eklenecekIsim);
        System.out.println(Arrays.toString(isimler)); // [Ali, Veli, Cem, Kemal]
    }

    public static String[] arrayeElementEkleme(String[] eklenilecekArray, String eklenecekElement){

        String[] temp= new String[eklenilecekArray.length+1];

        for (int i = 0; i < eklenilecekArray.length ; i++) {

            temp[i]=eklenilecekArray[i];
        }

        temp[temp.length-1] =eklenecekElement;

        return temp;
    }
}
