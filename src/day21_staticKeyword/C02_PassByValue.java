package day21_staticKeyword;

public class C02_PassByValue {

    public static void main(String[] args) {
        /*
        Java PassByValue kullanir
        Yannni method'lar arasinda gonderilen variable'larin
        kendileri degil, value'lari diger method'a yollanir.
         */

        int fiyat=100;
        // fiyat uzerinden %10 indirim yapip, indirimli fiyati donduren bir method olusturun

        System.out.println(indirimYap10(fiyat)); // 90
        System.out.println(indirimYap10(fiyat)); // 90
        System.out.println(indirimYap10(fiyat)); // 90
        System.out.println(indirimYap10(fiyat)); // 90


        System.out.println(fiyat); // 100

        // eger indirimli fiyatin kalici olarak fiyatimizi degistirmesini istersek
        // atama yapariz
        fiyat= indirimYap10(fiyat);

    }

    public static int indirimYap10(int a){

        a=a * 90 /100 ;

        return a;
    }
}
