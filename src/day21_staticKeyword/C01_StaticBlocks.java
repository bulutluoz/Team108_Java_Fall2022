package day21_staticKeyword;

public class C01_StaticBlocks {


    C01_StaticBlocks(){
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("Main method calismaya basladi");
    }

    static {
        // static block'lar class'daki tum yapilardan, hatta main method'dan bile once calisir
        // static block'da istedigimiz bir variable'a baslangic degerinin atanmasi
        // kullanicidan yetki sorgulamasi gibi islemler yapilabilir
        // main method calismadan once yapilmasi gereken islem oldugunda kullanilir
        // method'larin ve static block'larin siralamasi java acisindan onemli degildir
        // ancak birden fazla static block varsa, kendi aralarinda once ustteki calisir

        System.out.println("yukaridaki Static block calisti");
    }

    static {

        System.out.println("altdaki static block calisti");
    }
}
