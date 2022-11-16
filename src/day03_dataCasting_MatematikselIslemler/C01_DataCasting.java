package day03_dataCasting_MatematikselIslemler;

public class C01_DataCasting {
    public static void main(String[] args) {

        /*
        String str= 23;
        int sayi="Merhaba Java";
        char ilkHarf=true;

         */

        short sayi2=45;

        int sayi3=sayi2;
        // int   = short  degerin kapasitesi variable'in kapasitesinden kucuk oldugundan sorun yok

        int sayi4=45;

        double sayi5=sayi4;
        // double  =  int degerin kapasitesi variable'in kapasitesinden kucuk oldugundan sorun yok

        double sayi6= 5;
        //int sayi7=sayi6;
        // int     = double   double olan deger'in kapasitesi, int olan variable'in kapasitesinden buyuk
        //                    java otomatik cevirme yapmaz

        int sayi8=99;
        //byte sayi9=sayi8;


    }
}
