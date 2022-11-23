package day08_stringManipulation;

public class C05_charAt {
    public static void main(String[] args) {

        String str= "Java guzeldir"; // 13 tane karakter barindirir

        // java'da index 0'dan baslar
        // J==> 0.index, r==>12
        // charAt(index) ile istedigimiz index'deki char'a ulasabiliriz


        // ilk a'yi yazdiralim
        System.out.println(str.charAt(1));

        // sondan 2.harfi yazdiralim
        System.out.println(str.charAt(13-2)); // karakter sayisi -2 . indexdeki eleman

        // sondan 4.karakteri buyuk harf olarak yazdirin
        System.out.println(str.toUpperCase().charAt(13-4)); // L

        // charAt() method'u bize char döndürdügü icin toUppercase() calismaz
        // String method'larini charAt() ile kullanmak isterseniz
        // charAt()'den once kullanmalisiniz


        // System.out.println(str.charAt(18)); // StringIndexOutOfBoundsException
        // Eger index olarak karakter sayisi veya daha buyuk bir deger girersek
        // o index'i bulamayacagi icin hata verir

    }
}
