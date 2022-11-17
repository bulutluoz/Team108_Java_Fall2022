package day04_Increment_Concatenation;

public class C02_Pre_PostIncrement {
    public static void main(String[] args) {


        int a = 10;

        int b = a++;

        int c = ++a;

        System.out.println(a + ", " + b + ", "+ c); // 12, 10, 12


        int x= 20;

        int y= ++x;

        int z= y++;

        System.out.println(x + ", " + y + ", "+ z); // 21, 22, 21


        int k= 30;

        System.out.println(k++);// 30

        System.out.println(++k);// 32

        System.out.println(k++);// 32

        System.out.println(k); // 33


        int sayi1= 40;

        int sayi2= sayi1++;

        int sayi3= --sayi2;

        int sayi4= --sayi1;


        System.out.println(sayi1 + ", " + sayi2 + ", " + sayi3 + ", " + sayi4); // 40, 39, 39, 40



    }
}
