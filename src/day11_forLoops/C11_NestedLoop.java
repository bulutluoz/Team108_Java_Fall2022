package day11_forLoops;

public class C11_NestedLoop {
    public static void main(String[] args) {
        /*
        input degerine kadar her satirda * sayisini bir artirip
        sonra azaltarak asagidaki sekli yazdirin
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *

        ipucu : artis ve azalis kisimlarini 2 ayri nested loop ile yapmalisiniz
         */

        int input= 5;

        // artis kismi icin nested loop

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        // azalis kismi icin nested loop

        for (int i = input-1 ; i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}
