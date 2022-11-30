package day11_forLoops;

public class C12_MethodCreation {

    public static void main(String[] args) {

        // 5'in faktoryelini hesaplayin


        faktoryelyazdir(5);

        // kodun ilerleyen asamalarinda 7! lazim oldu

        faktoryelyazdir(7);


        // ilerleyen asamada 3! lazim oldu

        faktoryelyazdir(3);
    }





    public static void faktoryelyazdir(int i) {
        int carpim= 1;

        for (int j = 1; j <=i ; j++) {

            carpim*=j;
        }

        System.out.println(i + "! = "+ carpim);

    }
}
