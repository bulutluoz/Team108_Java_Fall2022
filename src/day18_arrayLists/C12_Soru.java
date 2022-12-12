package day18_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12_Soru {

    public static void main(String[] args) {

        // Soru 4- Verilen pozitif bir n tamsayisini alarak,
        // bize ilk n tane tane Fibonacci sayisini bir list olarak donduren bir method olusturun.

    }


    public static List<Integer> fibonacciListesiOlustur(){

        List<Integer> fibonacciList=new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen kac tane fibonacci sayisi istediginizi giriniz");

        int n= scan.nextInt();

        // 0,1,1,2,3,5,8,13,21,34,55......

        if (n<1){
            System.out.println("Gecersiz sayi");
        } else if (n==1) {
            fibonacciList.add(0);
            return fibonacciList;
        } else if (n==2) {
            fibonacciList.add(0);
            fibonacciList.add(1);
            return fibonacciList;
        }else{
            int sayi1=0;
            int sayi2=1;
            int sayi3=1;




        }

        return fibonacciList;
    }
}
