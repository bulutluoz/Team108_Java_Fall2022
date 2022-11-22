package day07_ternary_switchStatements;

public class C04_Ternary {

    public static void main(String[] args) {
        // Kullanicidan alinan deger
        // 100'den buyukse sayiyi 2 ile carpin
        // 100'e esit veya kucuk ise sayiya 10 ekleyin

        int input = 145;

        // if else ile yapalim

        if (input>100) {
            input*=2;
        } else {
            input+=10;
        }
        System.out.println("if else ile : "+input);

        input=145;

        input= input>100 ? input*2 : input+10 ;

        System.out.println("ternary ile : "+input);

        /*
          Verilen input'u inceleyin
          eger 100'den buyukse bunu 5'e bolup, bolum sonucunun tek sayi olup olmadigini kontrol edin
          eger 100'den buyuk degilse , 10 ile bolumunden kalani bulup, bu kalani 5 artirin


          Bu tur kompleks islemleri TERNARY ILE YAPMAYIZ
         */
    }
}
