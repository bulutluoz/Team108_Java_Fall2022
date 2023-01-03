package day28_exceptions;

import java.util.Scanner;

public class C05_MultipleExceptions {

    public static void main(String[] args) {

        /*
            Eger birden fazla exception olusma ihtimali varsa
            bu exception'lar birbirinden bagimsiz ise
                1- tek try istenen kadar catch yapilabilir
                2- ikisi icin ic ice try catch yapabilirim
                3- iki exception'i da kapsayan tek bir catch yapabilirim
         */


        String str= "Java'da cok fazla exception var";
        int[] arr= {3,5,1,3,2,6,3,6,8,5,2};

        // kullanicidan bir tamsayi alin
        // ve girilen sayiyi index olarak kullanip
        // str ve arr'den o indexdeki elementleri yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir index girin");
        int index= scan.nextInt();

        // System.out.println("String'den istenen index'deki element : " + str.substring(index,index+1));
        // System.out.println("Array'den istenen index'deki element : " + arr[index]);

        /* 1. cozum

        try{
            System.out.println("String'den istenen index'deki element : " + str.substring(index,index+1));
            System.out.println("Array'den istenen index'deki element : " + arr[index]);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("istenen index String'in sinirlari disinda");
        }catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("istenen index array'in sinirlari disinda");
        }

         */

        /* 2.cozum ic ice try catch


        try {
            try {
                System.out.println("String'den istenen index'deki element : " + str.substring(index,index+1));
                System.out.println("Array'den istenen index'deki element : " + arr[index]);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("istenen index String'in sinirlari disinda");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("istenen index array'in sinirlari disinda");
        }

         */

        // 3. cozum tek ama daha kapsamli bir exception kullanma

        try {
            System.out.println("String'den istenen index'deki element : " + str.substring(index, index + 1));
            System.out.println("Array'den istenen index'deki element : " + arr[index]);
        }catch(RuntimeException e){

            System.out.println("index String ve/veya Array'in sinirlari disinda");
            e.printStackTrace();
        }
    }
}
