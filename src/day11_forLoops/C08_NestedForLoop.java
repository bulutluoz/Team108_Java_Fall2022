package day11_forLoops;

public class C08_NestedForLoop {

    public static void main(String[] args) {
        // verilen input'a gore carpim tablosu olusturun
        // Java'da ic ice yapilara nested denir
        // burada sadece farkli olan i'nin katsayisi oldugundan onun icin de bir loop olusturalim

        int input = 4 ;
        /*
             1 2  3  4
             2 4  6  8
             3 6  9 12
             4 8 12 16
         */

        // 1 2  3  4
        for (int i = 1; i <=4 ; i++) {
            System.out.print(1*i + " ");
        }

        System.out.println("");
        // 2 4  6  8
        for (int i = 1; i <=4 ; i++) {
            System.out.print(2*i + " ");
        }
        System.out.println("");
        // 3 6  9 12
        for (int i = 1; i <=4 ; i++) {
            System.out.print(3*i + " ");
        }

        System.out.println("");
        // 4 8 12 16
        for (int i = 1; i <=4 ; i++) {
            System.out.print(4*i + " ");
        }
        System.out.println("");
        // Nested loop ile yapalim

        for (int i = 1; i <=4 ; i++) { // outer loop denir ve i'nin carpilacagi sayiyi kontrol edecek

            for (int j = 1; j <=4 ; j++) { // inner loop denir ve onceki ornekteki i degiskenini kontrol eder

                System.out.print(i*j + " ");
            }
            System.out.println("");
        }

        // outer loop'un her bir deger artisi icin
        // inner loop bastan sona calisir
    }
}












