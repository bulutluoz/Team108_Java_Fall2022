package day12_methodCreation;

public class C03_AsalSayi {

    public static void main(String[] args) {

        // verilen bir sayinin asal olup olmadigini true / false olarak donduren
        // bir method olusturun

        // asalSayiMi method'u boolean bir sonuc dondurdugunden
        // bu method'u calistirdigimizda
        // ya direk yazdirmaliyiz
        System.out.println(asalSayiMi(34)); // false

        // veya method call'un getirecegi sonucu atamak icin bir variable olusturabilirim

        boolean asalMiSonucu59= asalSayiMi(59);
        System.out.println("59 icin sonuc : " + asalMiSonucu59); // true


    }

    public static boolean asalSayiMi(int input){

        boolean asalSayiMi=true;

        for (int i = 2; i < input ; i++) {

            if (input%i == 0){ // eger burasi calisirsa asal sayi degil
                asalSayiMi=false;
                break;
            }

        }

        return asalSayiMi;
    }
}
