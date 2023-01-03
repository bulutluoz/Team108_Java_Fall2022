package day28_exceptions;

import java.util.Scanner;

public class C01_TryCatch {

    public static void main(String[] args) {


        // Kullanicidan iki tamsayi alip
        // sayilari birbirine bolup, sonucu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("birbirine bolmek icin 2 tamsayi giriniz");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        try {
            //1- try bolumu : yapmak istedigimiz ama exc. riski olusturan kodlar
            System.out.println("Iki sayinin bolumu : " + sayi1/sayi2);
        } catch (ArithmeticException e)
            // 2- catch () : bekledigimiz muhtemel exception ve
            //            bu exc. gerceklesirse hata dokumanini store edebilecegimiz variable

        {
            System.out.println("Bolecek sayi 0 olamaz");
            e.printStackTrace();
            // catch blogu : exception gerceklesirse calismasini istedigimiz kodlar
            //               burayi yazarken oncelikle
            //               exp/olustugunda kodlarin calismasi dursun mu ? yoksa devm mi etsin
            //               karar vermeliyiz
        }


    }
}
