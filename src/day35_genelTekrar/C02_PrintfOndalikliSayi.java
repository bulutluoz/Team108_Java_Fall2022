package day35_genelTekrar;

import java.util.Scanner;

public class C02_PrintfOndalikliSayi {

    public static void main(String[] args) {

        // kullanicidan boy ve kilosunu alip
        // vucut kitle endeksini ve durumunu yazdiralim
        // vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30 veya daha buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen kilonuzu kg olarak giriniz");
        double kilo= scan.nextDouble();

        System.out.println("Lutfen cm olarak boyunuzu giriniz");
        double boy= scan.nextDouble();

        double vke= kilo*10000/(boy * boy);

        // System.out.println("Vucut kitle endeksiniz : " + vke);
        System.out.printf("Vucut kitle endeksiniz : %8.1f %n",vke);

        if (vke>=30) System.out.println("Obezsiniz, gec kalmadan kendine ceki duzen vermelisin");
        else if (vke>=25) System.out.println("Kilolusunuz, rejime baslamalisiniz");
        else if (vke>=20) System.out.println("Kilonuz normal, boyle devam edin");
        else System.out.println("zayifsiniz, kilo almalisiniz");

    }
}
