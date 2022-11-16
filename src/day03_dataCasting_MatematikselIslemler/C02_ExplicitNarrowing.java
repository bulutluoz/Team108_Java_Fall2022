package day03_dataCasting_MatematikselIslemler;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        /*
           Eger genis kapasiteli bir data turunden dar kapasiteli bir data turune
           casting yapmak isterseniz
           Java bunu otomatik olarak gerceklestirmez, sizden sorumluluk almanizi bekler
           islemin gerceklesmesi icin cast yapmak istediginiz degerin onunde
           (donusturmek istedimiz data turu) yazilmalidir

           Explicit narrowing yapildiginda data kayiplari
           veya datanin beklenmedik bir sonuca donusmesi mumkundur
         */

        double dbl= 23.5;

        int sayi= (int)dbl;
        System.out.println(sayi); // 23

        byte byt= (byte)sayi;

        System.out.println(byt); // 23

        sayi=130;
        byt=(byte)sayi; // int daha kapsamli oldugu icin otomatik atama yapmaz, bizden mudahale ister

        System.out.println("int 130'un byte hali :"+byt); //  -126

        sayi=256;
        byt=(byte)sayi; // int daha kapsamli oldugu icin otomatik atama yapmaz, bizden mudahale ister

        System.out.println("int 256'in byte hali :"+byt); //  0

        sayi=13000;
        byt=(byte)sayi; // int daha kapsamli oldugu icin otomatik atama yapmaz, bizden mudahale ister

        System.out.println("int 13000'un byte hali :"+byt); //  -56

    }
}
