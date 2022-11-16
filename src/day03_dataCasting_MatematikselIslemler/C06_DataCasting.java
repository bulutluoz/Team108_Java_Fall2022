package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C06_DataCasting {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan bir double, bir  tamsayi alin,
        // double sayiyi tam sayiya bolun
        // ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir ondalikli sayi giriniz");
        double sayiDbl= scan.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz");
        int sayiInt= scan.nextInt();

        System.out.println((int)(sayiDbl/sayiInt)); // sonucu double olarak yazdirir
    }
}
