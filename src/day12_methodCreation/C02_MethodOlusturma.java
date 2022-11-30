package day12_methodCreation;

public class C02_MethodOlusturma {

    public static void main(String[] args) {

        // verilen 2 sayiyi carpip sonucu yazdiran bir method olusturun

        // bir method ancak method call yapildiginda calisir
        // method call icin method adi ve parametrelere uygun argument yazilmalidir
        // method call icerisinde yazilan variable veya degerlere argument denir

        carpYazdir(5,8); // 40.0
        carpYazdir(7.4,8.6); // 63.64

        // carpYazdir("ali","veli"); argument ve parametreler uyumlu degilse CTE olur


    }

    public static void carpYazdir(double sayi1, double sayi2){



        System.out.println(sayi1 * sayi2);
    }


}
