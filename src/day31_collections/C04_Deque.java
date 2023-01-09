package day31_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {
    public static void main(String[] args) {
        // Deque double ended queue demektir
        // iki yonlu kuyruk
        // Bu iki yonlu yapisindan dolayi pek cok method'un first() ve last() versiyonu vardir

        Deque<String> harfler=new LinkedList<>();
        harfler.add("J");
        harfler.add("L");

        System.out.println(harfler); // [J, L]
        harfler.addFirst("B");
        System.out.println(harfler); // [B, J, L]

        System.out.println(harfler.removeFirst()); // B
        System.out.println(harfler); // [J, L]

        harfler.addFirst("A");
        harfler.addLast("A");
        harfler.add("K");

        System.out.println(harfler); //  [A, J, L, A, K]

        // sona dogru olan A'yi silin
        System.out.println(harfler.removeLastOccurrence("A")); // true
        System.out.println(harfler); //  [A, J, L, K]

        System.out.println(harfler.removeLastOccurrence("T")); // false


        LinkedList<String> karakterler= new LinkedList<>();
        karakterler.push("A"); // addFirst() ile ayni islemi yapar
        karakterler.push("B");
        System.out.println(karakterler); // [B, A]

        System.out.println(karakterler.clone()); // // [B, A]

        LinkedList<String> kopyaKarakterler= (LinkedList<String>) karakterler.clone();
        System.out.println(kopyaKarakterler);


    }
}
