package day22_immutableClasses;

public class C03_ImmutableClasses {
    public static void main(String[] args) {

        String str= "Java";

        str = str.replace("J","H");


        System.out.println(str); // Hava


        str= str.toLowerCase();

        System.out.println(str); // hava


        // Asagidaki kod calisirsa Java kac obje olusturur ?

        String a= "ABC";

        for (int i = 0; i <10 ; i++) {
            a= a+ i;
        }
        System.out.println(a); // ABC0123456789

    }
}
