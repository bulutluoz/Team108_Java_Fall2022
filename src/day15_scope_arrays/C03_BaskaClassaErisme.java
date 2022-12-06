package day15_scope_arrays;

public class C03_BaskaClassaErisme {

    public static void main(String[] args) {

        /*
            java OOP konsept cercevesinde baska class'lardaki class uyelerini (variable/method) kullanabiliriz
            Baska class'daki herhangi bir class uyesine erismek istedigimizde
            static keyword onemli bir rol oynar

            static olarak isaretlenen class uyelerine
            classIsmi.staticUyeIsmi seklinde ulasabiliriz

            static olmayan class uyelerine erisebilmek icin obje olusturmamiz gerekir


            Java runtime program'dir
            basinca calisir, calistigi surece yapilan islemleri KALICI olarak tutar
            calisma bittiginde HER SEY YOK OLUR
         */

        System.out.println(C01_Hastane.hastaneAdres); // Cankaya ? Ankara
        C01_Hastane.method1(); // Cankaya/Ankara
        System.out.println(C01_Hastane.hastaneIsmi); // Yildiz Hastanesi

        C01_Hastane per1=new C01_Hastane();

        System.out.println(per1.personelAdresi);//null
        System.out.println(per1.hastaneIsmi); // Yildiz

        per1.personelIsmi="Belkis";
        per1.personelAdresi="Istanbul";
        per1.hastaneAdres="Uskudar";

        System.out.println(per1.personelIsmi); // Belkis
        System.out.println(per1.personelAdresi); // Istanbul
        System.out.println(per1.personelTel); // null
        System.out.println(per1.hastaneIsmi); // Yildiz
        System.out.println(per1.hastaneAdres); // Uskudar
    }
}
