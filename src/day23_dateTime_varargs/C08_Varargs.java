package day23_dateTime_varargs;

public class C08_Varargs {
    public static void main(String[] args) {

        /*
          Argument olarak tamsayilar alip
          ilk argument haric geriye kalanlari toplayip
          bulunan toplami ilk argument ile carpip
          sonucu yazdiran bir method olusturun
          (Not argument sayisi degisken olabilir)
         */

        islemYap(3,4,5,8,1,2); // 60
        islemYap(5,1); // 5
        islemYap(4); // 0
        islemYap(3,4,5,6); // 45

        islemYap(2,4,5);


    }

    private static void islemYap(int ilkSayi, int... geriyeKalanlar) {

        int geriyeKalanlarToplami=0;

        for (int each: geriyeKalanlar
             ) {

            geriyeKalanlarToplami += each;
        }

        System.out.println(geriyeKalanlarToplami*ilkSayi);
    }
}
