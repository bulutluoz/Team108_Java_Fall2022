package day15_scope_arrays;

public class C02_Hastane {

    static String hastaneIsmi="Yildiz Hastanesi";
    static String hastaneAdres="Cankaya/Ankara";

    String personelIsmi="Personel";
    String personelAdresi="Adres";
    String personelTel="Telefon";

    public static void main(String[] args) {

        C02_Hastane per1=new C02_Hastane();


        C02_Hastane per2= new C02_Hastane();

        per1.personelIsmi= "Harun";

        per2.personelAdresi="Cankaya";

        per1.hastaneIsmi="Java Hastanesi";

        System.out.println(per1.personelTel); // Telefon
        System.out.println(per1.personelIsmi); // Harun
        System.out.println(per2.personelIsmi); // Personel
        System.out.println(per2.personelAdresi); // Cankaya

        System.out.println(per1.hastaneIsmi); // Java
        System.out.println(per2.hastaneIsmi); // Java
        System.out.println(hastaneIsmi); // Java


        per1.personelIsmi= "Mehmet";

        System.out.println(per1.personelIsmi); // Mehmet
        System.out.println(per2.personelIsmi); // personel
    }
}
