package day21_staticKeyword;

import java.util.Arrays;

public class C05_PassByValueCokluElement {

    public static void main(String[] args) {

        int[] arr = {3,6,9,1,7};

        // bir method olusturup, arr'yi method'a yollayalim
        // method'da arr'in elementleri uzerinde degisiklik yapalim ve arr'yi yazdiralim
        elementleriDegistir(arr);
        System.out.println(Arrays.toString(arr)); // [13, 6, 19, 1, 7]
    }
    public static void elementleriDegistir(int[] b){

        b[0]=13;
        b[2]=19;

        System.out.println(Arrays.toString(b)); // [13, 6, 19, 1, 7]
    }
}
