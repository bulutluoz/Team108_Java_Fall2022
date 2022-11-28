package day10_stringManipulations;

public class C01_NullPointer {
    public static void main(String[] args) {

        String str1= "";
        String str2= "    ";
        String str3;
        String str4= null;

        System.out.println(str1.length()); // 0
        System.out.println(str2.length()); // 4

        System.out.println(str1.isEmpty()); // true
        System.out.println(str2.isEmpty()); // false

        System.out.println(str1.isBlank()); // true
        System.out.println(str2.isBlank()); // true

        // null bir deger degil isaretcidir (null pointer)
        // null pointer : non primitive bir objenin olusturuldugunu
        //                ancak bilincli olarak deger atanmadigini isaretler
        //                str4'un degeri null'dir cumlesi YANLIS
        //                str4 null olarak isaretlenmistir cumlesi DOGRU

        // System.out.println(str3.length());
        // System.out.println(str3.concat("Ali Can"));
        // System.out.println(str3.substring(3, 4));
        /*
           java bir variable'i olusturup deger atanmamasina izin verir
           bir variable'i deger atamadan OLUSTURABILIRSINIZ ancak KULLANAMAZSINIZ,
           deger atanmayan bir variable'i kullanmaya kalkarsaniz
           Java CTE verir.

            null pointer ise bu variable'a bir deger atanmadigini
            ve bunun bilincli bir tercih oldugunu Java'ya soyler
            dolayisiyla Java kodlarin calismaya devam etmesine izin verir
            Ancak deger atanmadigi icin method'larla kullanmaya calisirsaniz
            NullPointerException verir
         */
        str4 = null;
        // System.out.println(str4.length());  // NullPointerException
        // System.out.println(str4.substring(3, 4)); // NullPointerException

        System.out.println(str4); // null
        System.out.println(str4 + "Ali Can"); // nullAli Can
        System.out.println(str4.concat("Ali Can")); // NullPointerException
    }
}
