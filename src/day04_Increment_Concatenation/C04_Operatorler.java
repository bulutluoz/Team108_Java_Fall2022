package day04_Increment_Concatenation;

public class C04_Operatorler {

    public static void main(String[] args) {

        int a= 10;
        int b= 15;
        boolean c;

        System.out.println(c=a*15==b*10); // true

        System.out.println(c); // true

        System.out.println(!true); // false
        System.out.println(!(a<b)); // false


        c=   a<=b    ;


        /*   int a=10;
             hem 3'e hem 5'e bolunebilen sayilar
                a%3==0  && a%5==0

             3'e veya 5'e bolunebilen sayilar
                a%3==0  || a%5==0

             0'dan buyuk ve 100'den kucuk sayilar
                0 < a < 100  matematikte 3'lu karsilastirma mumkundur
                             ancak Java 3'lu karsilastirma yapmaz
                             2'li karsilastirmalar yapip,
                             mantiksal operatorlerle birbirine baglamalisiniz

                0<a  && a<100  java'da boyle yazilir

             0'dan kucuk veya 100'den buyuk sayilar
                a<0 || a>100

             bir ucgenin 3 kenari a,b,c uzunluklarindadir.
             bu ucgenin eskenar oldugunu kontrol etmek isterseniz
                a==b  && b==c

         */



    }
}
