package day18_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_remove {

    public static void main(String[] args) {

        List<String> harfler= new ArrayList<>();

        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        System.out.println(harfler.remove("Z"));
        // true  Z'yi bulup siler ve gorevi tamamladigi icin true doner
        System.out.println(harfler); // [A, T]

        System.out.println(harfler.remove(0)); // A
        // 0.index'deki elementi siler ve gorevi tamamlayip silinen elementi bize dondurur
        System.out.println(harfler); // [T]

        List<String> yeniList = new ArrayList<>();

        yeniList.add("C");
        yeniList.add("D");
        yeniList.add("T");

        System.out.println(yeniList.removeAll(harfler)); // true
        // harfler listesindeki tum elementleri yeniList'den siler
        // gorevi tamamlarsa true, yoksa false doner

        System.out.println(yeniList); // [C, D]
        System.out.println(harfler); // [T]





    }
}
