package day34_Maps_NestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMap {

    public static void main(String[] args) {
        /*
        Asagidaki body'yi map olarak olusturun
        {
            "firstname" : "Ahmet",
            "lastname" : “Bulut",
            "totalprice" : 500,
            "depositpaid" : false,
            "bookingdates" : {
                   "checkin" : "2021-06-01",
                   "checkout" : "2021-06-10"
                      },
            "additionalneeds" : "wi-fi" }
         */

        Map<String,String> bookingdatesMap = new HashMap();
        bookingdatesMap.put("checkin" , "2021-06-01");
        bookingdatesMap.put("checkout" , "2021-06-10");

        Map<String,Object> bookingMap= new HashMap();
        bookingMap.put("firstname" , "Ahmet");
        bookingMap.put("lastname" , "Bulut");
        bookingMap.put("totalprice" , 500);
        bookingMap.put("depositpaid" , false);
        bookingMap.put("bookingdates",bookingdatesMap);
        bookingMap.put("additionalneeds" , "wi-fi" );

        System.out.println(bookingMap);

        /*
        {
        firstname=Ahmet,
        additionalneeds=wi-fi,
        bookingdates={
                checkin=2021-06-01,
                checkout=2021-06-10},
        totalprice=500,
        depositpaid=false,
        lastname=Bulut}

         */

        // isim bilgisini yazdirin
        System.out.println(bookingMap.get("firstname")); // Ahmet

        // additionalneeds yazdirin

        System.out.println(bookingMap.get("additionalneeds")); // wi-fi

        // check-in bilgisini yazdirin
        // booking map'indeki value data turu Object sectik
        // dolayisiyla bookingdates key'ine ait value'yu Object olarak bize getirir
        // ama biz onun map oldugunu biliyoruz
        // casting yapabiliriz

        System.out.println(((Map) bookingMap.get("bookingdates")).get("checkin")); // 2021-06-01

        // check-out tarihini yazdiralim

        System.out.println(((Map) bookingMap.get("bookingdates")).get("checkout")); // 2021-06-10
    }
}
