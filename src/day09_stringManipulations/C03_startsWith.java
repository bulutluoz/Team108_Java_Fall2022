package day09_stringManipulations;

public class C03_startsWith {
    public static void main(String[] args) {

        String str= "Java mutluluktur";

        System.out.println(str.startsWith("Java")); // true
        System.out.println(str.startsWith("j")); // false

        System.out.println(str.startsWith("Java mutluluktur")); // true

        System.out.println(str.startsWith("")); // true

        System.out.println(str.contains("mutlu")); // true
        System.out.println(str.startsWith("mutlu")); // false

        System.out.println(str.startsWith("mutlu",5)); // true

        System.out.println(str.startsWith("v",2)); // true


    }
}
