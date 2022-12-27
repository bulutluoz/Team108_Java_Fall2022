package day24_StringBuilder;

public class C01_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder();
        // kapasitesi 16 olan bos bir StringBuilder olusturur

        System.out.println(sb1); // bos bir satir yazdirir
        System.out.println(sb1.capacity()); // 16


        StringBuilder sb2= new StringBuilder(11);
        System.out.println(sb2); // bos bir satir yazdirir
        System.out.println(sb2.capacity()); // 11


        StringBuilder sb3= new StringBuilder("Java Candir");
        System.out.println(sb3); // Java Candir
        System.out.println(sb3.capacity()); // 27


        sb2.append("Java");
        System.out.println(sb2); // Java
        System.out.println(sb2.capacity()); // 11

        sb2.append(" Candir");
        System.out.println(sb2); // Java Candir
        System.out.println(sb2.capacity()); // 11

        sb2.append(".");
        System.out.println(sb2); // Java Candir.
        System.out.println(sb2.capacity()); // 24 = 2 * 11 +2



    }
}
