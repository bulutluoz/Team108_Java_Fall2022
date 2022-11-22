package day07_ternary_switchStatements;

public class C06_Sorular {

    public static void main(String[] args) {
        // Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        int input= 44;

        System.out.println(input>=50 ? "Sinifi Gectin" : "Maalesef kaldin");


        // Soru 3- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        char karakter='.';

        System.out.println(karakter>='a' && karakter<='z' ? (char)(karakter-32) : karakter);

        // Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin

        input= 125;

        //   |5| => 5   |-4| => (-1)*(-4) =>4

        System.out.println(input>0 ? input : (-1)*input);



    }
}
