package day26_inheritance;

class Okul{

        String okulIsmi="Yildiz Koleji";
        String telefon="3123456543";
}


public class C01_Sinif extends Okul{
    String sinif="11-C";
    String telefon="3122343434";

    C01_Sinif(String telefon){

        System.out.println(telefon);
        System.out.println(this.telefon);
        System.out.println(super.telefon);

        System.out.println(okulIsmi);
        System.out.println(this.okulIsmi);
        System.out.println(super.okulIsmi);

        System.out.println(sinif);
        System.out.println(this.sinif);
        // System.out.println(super.sinif);
        // Java'da parent'da bulamadigini gidip child'a sorayim OLMAZ
        // parent class'da aranan sinif degeri olmadigindan CTE verir
    }

    public static void main(String[] args) {

        C01_Sinif obj= new C01_Sinif("4222342323");
    }
}
