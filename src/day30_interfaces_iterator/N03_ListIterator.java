package day30_interfaces_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class N03_ListIterator {
    public static void main(String[] args) {

        // Soru 1) Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program yaziniz .
        //  (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
        //	Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
        //	output: [23,40]

        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(56);
        sayilar.add(23);
        sayilar.add(45);
        sayilar.add(14);
        sayilar.add(40);

        ListIterator lit= sayilar.listIterator();

        while (lit.hasNext()){

            Integer sayi= (Integer) lit.next();

            if (sayi<20 || sayi>40 ){
                lit.remove();
            }
        }

        System.out.println(sayilar);
    }
}
