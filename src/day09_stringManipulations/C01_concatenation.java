package day09_stringManipulations;

public class C01_concatenation {
    public static void main(String[] args) {

        String str1= "Java";
        String str2= "candir";

        System.out.println(str1+ " " + str2); // Java candir

        System.out.println(str1.concat(str2)); // Javacandir

        System.out.println(str1.concat(" ").concat(str2)); // Java candir


    }
}
