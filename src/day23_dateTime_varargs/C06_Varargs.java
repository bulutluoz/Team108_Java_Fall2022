package day23_dateTime_varargs;



public class C06_Varargs {
    public static void main(String[] args) {

        // Oyle bir method olusturalim ki
        // kactane argument yazarsam yazayim
        // argumentlerin toplamini versin

        topla(5,6); //11
        topla(5,8,2); //15
        topla(4,6,2,9,3,4,8,1,2); // 39

        /*
            Varargs array altyapisini kullanir
            Temel hedef argument sayisi degisse bile
            ayni data turundeki tum argumentleri alabilecek bir parametre olusturmaktir.
         */
    }

    private static void topla(int... sayilar) {

        int toplam1=0;
        for (int i = 0; i < sayilar.length ; i++) {
            toplam1 += sayilar[i];
        }
        System.out.println(toplam1);

        int toplam2=0;

        for (int each:sayilar
             ) {
            toplam2 += each;
        }
        System.out.println(toplam2);
    }
}
