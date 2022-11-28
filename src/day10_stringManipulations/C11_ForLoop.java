package day10_stringManipulations;

public class C11_ForLoop {

    public static void main(String[] args) {

        // verilen sayinin faktoryelini hesaplayin
        // 5! = 5*4*3*2*1

        int input=6;
        int carpim=1;

        for (int i = input; i >=1 ; i--) {
            carpim*=i;
        }

        System.out.println("verilen " + input + " sayisinin faktoryeli : " + carpim);
    }
}
