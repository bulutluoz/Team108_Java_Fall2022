package day02_variables_scanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan bir double, bir de int sayi alip
        bunlarin toplamini ve carpimini yazdirin.

         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir ondalikli sayi girin");
        double sayiDbl= scan.nextDouble();
        System.out.println("Lutfen bir tamsayi girin");
        int sayiInt= scan.nextInt();


        System.out.println("Sayilarin toplami : " + (sayiDbl+sayiInt));

        System.out.println("Sayilarin carpimi : " + sayiDbl*sayiInt);
    }
}
