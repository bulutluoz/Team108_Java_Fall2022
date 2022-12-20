package day23_dateTime_varargs;

public class C09_Varargs {

    public static void main(String[] args) {
        /*
          Argument olarak tamsayilar alip
          son argument haric geriye kalanlari toplayip
          bulunan toplami son argument ile carpip
          sonucu yazdiran bir method olusturun
          (Not argument sayisi degisken olabilir)
         */

        // islemYap(3,4,5,8,1,2); // 60

        /* Varargs sinirsiz sayida element alma ozelligine sahiptir
          dolayisiyla varargs olarak tanimlanan bir parametreden sonra
          parametre kullanirsaniz, CTE olusur

          Cunku varargs tum argumentleri almak ister
          bu durumda sonraki parametreye element kalmaz

          KURAL : Bir method'da parametre olarak varargs kullanilacaksa
                  son parametre olarak kullanilmalidir.

                  Bu kural gozonune alindiginda bir method'da
                  parametre olarak birden fazla varargs KULLANILAMAZ

                  Parametrelerin data turunun degismesi bu kurali etkilemez

         */


    }
    /*
    private static void islemYap(int... geriyeKalanlar , int sonSayi) {

        int geriyeKalanlarToplami=0;
    }

     */


    }

