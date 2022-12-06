package day15_scope_arrays;

public class C01_Hastane {
    static String hastaneIsmi="Yildiz Hastanesi";
    static String hastaneAdres="Cankaya/Ankara";

    String personelIsmi;
    String personelAdresi;
    String personelTel;

    public static void main(String[] args) {
        /*
           Eger tum method'lardan kullanilabilecek variable'lar olusturmak isterseniz
           bu variable'lari class level'da olustururuz

           Class level'da olusturulacak variable'lar icin 2 ihtimal vardir
           1- static variable (Class variable)
           2- instance(static olmayan) variable ( obje variable)

           Kural1- static variable'lar tum objeler icin tek bir deger alir
                   instance variable'lar her obje icin java tarafindan cogaltilir

           Kural2-class level variable'lara deger atamasak da kullanabiliriz
                  biz deger atamasakl bile java class level variable'lara default degerler atar
                  non-primitive ==> null (String)
                  sayisal primitive ==> 0
                  char ==> hiclik ''
                  boolean ==> false

          Kural3- static olan method'lardan static olmayan variable ve method'lara direk ulasilmaz
                  instance variable ve static olmayan method'lari static alanlardan kullanmak isterseniz
                  obje uzerinden kullanabilirsiniz.

          Kural4- class'da olusturulan instance variable'lar ilk deger atamasini yapar
                  yani bir obje ilk olusturuldugunda otomatik olarak instance variable'a atanan degeri alir
                  deger atanmamissa default degerleri alir
                  obje olusturulduktan sonra obje uzerinden yapilan atamalar
                  class level'daki instance variable'a degil, java tarafindan olusturulup
                  objeye yapistirilan kopya variable'a yapilir
         Kural5- static variable'lar tum objeler icin ortaktir.
                 static variable'lara tum class'dan direk ulasilabilir
                 static variable'in degeri degisirse tum objeler icin degismis olur

         */

        C01_Hastane per1= new C01_Hastane();

        System.out.println(per1.personelIsmi); // null
        System.out.println(per1.personelAdresi);//null;
        System.out.println(per1.personelTel);//null

        // System.out.println(personelIsmi);
        per1.personelIsmi="Fidan";
        per1.personelAdresi="Germany";
        per1.personelTel="+491712342323";


        C01_Hastane per2= new C01_Hastane();
        System.out.println(per2.personelIsmi); // null


        per1.personelIsmi="Yusuf";
        System.out.println(per2.personelIsmi);// null
        per2.personelIsmi="Ayten";
        System.out.println(per2.personelIsmi); // Ayten
        System.out.println(per1.personelIsmi); // Yusuf


        System.out.println(hastaneIsmi); // Yildiz Hastanesi

        System.out.println(per1.hastaneIsmi); // Yildiz Hastanesi

        per2.hastaneIsmi="Java Hastanesi";

        System.out.println(hastaneIsmi); // Java Hastanesi
        System.out.println(per1.hastaneIsmi); // Java Hastanesi
        System.out.println(per2.hastaneIsmi); // Java Hastanesi


    }

    public static void method1(){
        System.out.println(hastaneAdres);
    }

    public void method2(){
        System.out.println(hastaneIsmi);
    }
}
