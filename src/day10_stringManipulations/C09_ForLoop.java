package day10_stringManipulations;

import java.util.Scanner;

public class C09_ForLoop {

    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis degerlerini alip
        // bu sinirlar dahil olarak, bu sayilar arasinda 5'in kati olan sayilari yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Baslangic degerini giriniz");
        int baslangic= scan.nextInt();

        System.out.println("Bitis degerini giriniz");
        int bitis= scan.nextInt();

        for (int i = baslangic; i <=bitis ; i++) {

            if (i%5==0){
                System.out.print(i + " ");
            }
        }
    }
}
