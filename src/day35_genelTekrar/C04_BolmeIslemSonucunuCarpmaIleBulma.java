package day35_genelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_BolmeIslemSonucunuCarpmaIleBulma {

    public static void main(String[] args) {

        // Kullanicidan bolunecek sayi ve bolecek sayiyi alip
        // bolme isleminin sonucunu, carpma islemi ile bulan ve yazdiran bir method olusturun
        // Bu islemi kullanici Q'ya basincaya kadar devam ettirin


        Scanner scan= new Scanner(System.in);
        boolean devamEdelimMi=true;
        int bolunecekSayi=1;
        int bolenSayi=1;

        do{
            System.out.println("Lutfen bolunecek tamsayiyi girin,\nbitirmek icin Q'ya basin");

            try {
                bolunecekSayi= scan.nextInt();
                System.out.println("Lutfen bolecek sayiyi giriniz");
                bolenSayi= scan.nextInt();
                bolumSonucunuYazdir(bolunecekSayi,bolenSayi);

            } catch (InputMismatchException e) {

                String girilenStr= scan.nextLine();
                // 24.satirda nextInt() ile degeri alamadiysa, exception olusacak
                // bu satira gelecek ve biz o degeri nextLine() ile alacagiz

                if (girilenStr.equalsIgnoreCase("Q")){
                    devamEdelimMi=false;
                }else{
                    System.out.println("Bolunecek sayi tamsayi olmalidir");
                }

            }


        }while(devamEdelimMi);



    }

    private static void bolumSonucunuYazdir(int bolunecekSayi, int bolenSayi) {

        // bolunecek sayi ve bolen sayi negativ veya pozitif olabilir
        // bu durumda oncelikle isaret kontrolu yapmamiz lazim
        // isaret sorununu cozmek icin
        // once islem sonucunun isretini belirleyip,


        int sonucIsareti=1;

        if (bolunecekSayi*bolenSayi<0){
            sonucIsareti=-1;
        }

        // sonra sayilari isaretten bagimsiz hale getirelim

        bolunecekSayi= bolunecekSayi>=0 ? bolunecekSayi : bolunecekSayi*(-1);
        bolenSayi= bolenSayi>=0 ? bolenSayi : bolenSayi*(-1);


        int bolumSonucu=1;

        while (bolumSonucu*bolenSayi<bolunecekSayi){
            bolumSonucu++;
        }
        bolumSonucu--;
        System.out.println("Bolme isleminin sonucu : " + bolumSonucu*sonucIsareti);

    }
}
