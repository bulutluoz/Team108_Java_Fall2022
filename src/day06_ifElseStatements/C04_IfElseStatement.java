package day06_ifElseStatements;

import java.util.Scanner;

public class C04_IfElseStatement {

    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Bir harf giriniz");

        char girilenHarf=scan.next().charAt(0);

        if (girilenHarf>='A' && girilenHarf<='Z'){
            System.out.println("Girilen harf buyuk harf");
        }else {
            System.out.println("Girilen karakter buyuk harf degil");
        }
    }
}
