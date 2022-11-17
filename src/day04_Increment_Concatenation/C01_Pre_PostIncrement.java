package day04_Increment_Concatenation;

public class C01_Pre_PostIncrement {
    public static void main(String[] args) {

        int sayi=20;

        // sayiyi 3 artirin

        sayi = sayi+3;
        sayi +=3;

        sayi++;
        sayi++;
        sayi++;

        System.out.println(sayi); // 29

        // sayinin degerini 2 azaltin

        sayi = sayi - 2;

        sayi -= 2;

        sayi--;
        sayi--;

        System.out.println(sayi); // 23

        sayi= 10 ;
        // sayinin degerini once 1 azaltin, sonra yazdirin

        sayi--;
        System.out.println(sayi); // 9
        // bu islemde ekranda gordugumuz 9, sayinin degeri 9
        System.out.println(sayi); // 9


        sayi=10;
        // sayiyi once yazdirin, sonra 1 azaltin

        System.out.println(sayi); // 10
        sayi--;

        // ekranda gorulen 10, ama sayinin son degeri 9
        System.out.println(sayi); // 9



        sayi=10;
        sayi++;  // sayiyi 1 artirir
        ++sayi;  // sayiyi 1 artirir
        System.out.println(sayi); // 12


        sayi=10;
        System.out.println(sayi++); // 10
        // Java ayni satirda iki islem oldugundan siralama yapar
        // eger ++ variable'dan sonra ise artirma islemini sonra yapar
        // bu durumda once yazdirma, sonra artirma islemi yapar

        System.out.println(sayi); // 11



        sayi=10;
        System.out.println(++sayi);// 11
        // ++ variable'dan once ise artirma islemini once yapar
        // bu durumda java once artirma sonra yazdirma islemi yapar

        System.out.println(sayi); // 11





    }
}
