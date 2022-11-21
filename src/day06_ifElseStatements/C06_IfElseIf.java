package day06_ifElseStatements;

import java.util.Scanner;

public class C06_IfElseIf {

    public static void main(String[] args) {
        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Cinsiyetinizi Giriniz\nK : Kadin, E : Erkek ");
        char cinsiyet=scan.next().charAt(0);

        System.out.println("Lutfen tam sayi olarak yasinizi giriniz");
        int yas= scan.nextInt();

        if ((cinsiyet=='K' || cinsiyet=='k') && yas>=60 && yas<80){
            System.out.println("Emekli olabilir");
        } else if ((cinsiyet=='K' || cinsiyet=='k') && yas>=18 && yas<80) {
            System.out.println("Emekli olmak icin " + (60-yas) + " yil daha calismalisin");
        } else if ((cinsiyet=='e' || cinsiyet=='E') && yas>=65 && yas<80) {
            System.out.println("Emekli olabilir");
        }else if ((cinsiyet=='E' || cinsiyet=='e') && yas>=18 && yas<80) {
            System.out.println("Emekli olmak icin " + (65 - yas) + " yil daha calismalisin");
        }else{
            System.out.println("Gecersiz bilgi");
        }
    }


}
