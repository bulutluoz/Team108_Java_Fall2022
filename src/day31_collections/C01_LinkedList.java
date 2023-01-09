package day31_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList {

    public static void main(String[] args) {

        /*
            Collections objeleri bir arada tutan yapilardir
            Gercek hayattaki ihtiyaclara gore Java farkli collection yapilari olusturmustur
            Bir uygulamada hangi collection'i kullanacagimiza istedigimiz ozelliklere gore karar veririz

            Colections temel de 3 ana gruba ayrilir ve 3 Interface ile kurallari belirlenmistir
                - List
                - Queue
                - Set
            Ancak Interface'lerden obje olusturulamayacagi icin
            child class'larinin constructor'lari kullanilir.
            Burada ozelikleri belirleyen constructor degil DATA TURU olarak secilen collection'dir

            Ornegin Linked list olustururken sececegimiz data turu ile
            Queue, Deque, List veya tumunun ozelliklerini tasiyan LinkedList'ler olusturabiliriz
         */

        LinkedList<String> ll1 = new LinkedList<>();
        List<String> ll2= new LinkedList<>();
        Queue<String> ll3 = new LinkedList<>();
        Deque<String> ll4 = new LinkedList<>();


    }
}
