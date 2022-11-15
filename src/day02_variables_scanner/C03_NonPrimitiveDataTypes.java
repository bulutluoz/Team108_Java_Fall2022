package day02_variables_scanner;

public class C03_NonPrimitiveDataTypes {
    public static void main(String[] args) {


        String str= "Java candir";
        int sayi=10;

        // primitive data turlerinin hazir method'lari yoktur
        // ancak non-primitive data turlerinin onceden hazirlanmis ,
        // bizim kullanabilecegimiz method'lari olur

        System.out.println(sayi); // 10

        System.out.println(str.toLowerCase()); // java candir

        System.out.println(str); // Java candir

        System.out.println(str.toUpperCase()); // JAVA CANDIR


        System.out.println(str); // Java candir

        System.out.println(str.isEmpty()); // false

    }
}
