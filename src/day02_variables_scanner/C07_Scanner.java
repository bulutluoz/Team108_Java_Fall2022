package day02_variables_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan ismini, soyismini ve yasini alip,
        asagidaki formmatta yazdirin.

		Isminiz : John
		Soyisminiz : Doe
		Yasiniz : 44
		Kaydiniz basariyla tamamlanmistir.

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String girilenIsim = scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String girilenSoyisim= scan.nextLine();
        System.out.println("Lutfen Yasinizi giriniz");
        int girilenYas= scan.nextInt();

        System.out.println("isminiz : " + girilenIsim +
                           "\nSoyisminiz : " + girilenSoyisim +
                           "\nyasiniz : " + girilenYas +
                           "\nkaydiniz basariyla tamamlanmistir.");
    }
}
