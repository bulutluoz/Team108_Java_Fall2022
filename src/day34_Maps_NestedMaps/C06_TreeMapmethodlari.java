package day34_Maps_NestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C06_TreeMapmethodlari {

    public static void main(String[] args) {
        TreeMap<String, Integer> harfSayilariMap = new TreeMap<>();
        harfSayilariMap.put("A",10);
        harfSayilariMap.put("C",15);
        harfSayilariMap.put("D",3);
        harfSayilariMap.put("K",5);

        System.out.println(harfSayilariMap); // {A=10, C=15, D=3, K=5}

        System.out.println(harfSayilariMap.subMap("C", "F")); // {C=15, D=3}
        System.out.println(harfSayilariMap.subMap("C", "K")); // {C=15, D=3}  C dahil, K haric
        System.out.println(harfSayilariMap.subMap("B", "K")); // {C=15, D=3}

        System.out.println(harfSayilariMap.descendingMap()); // {K=5, D=3, C=15, A=10}

        System.out.println(harfSayilariMap.lowerKey("E")); // D
        System.out.println(harfSayilariMap.lowerKey("D")); // C

        System.out.println(harfSayilariMap.floorKey("E")); // D
        System.out.println(harfSayilariMap.floorKey("D")); // D

        System.out.println(harfSayilariMap.higherKey("D")); // K
        System.out.println(harfSayilariMap.ceilingKey("D")); // D

        System.out.println(harfSayilariMap); // {A=10, C=15, D=3, K=5}

        System.out.println(harfSayilariMap.headMap("D")); // {A=10, C=15}
        System.out.println(harfSayilariMap.headMap("D", true)); // {A=10, C=15, D=3}

        System.out.println(harfSayilariMap.tailMap("C")); // {C=15, D=3, K=5}
        System.out.println(harfSayilariMap.tailMap("C", false)); // {D=3, K=5}

        System.out.println(harfSayilariMap.pollFirstEntry()); // A=10
        System.out.println(harfSayilariMap); // {C=15, D=3, K=5}

        System.out.println(harfSayilariMap.pollLastEntry()); // K=5
        System.out.println(harfSayilariMap); // {C=15, D=3}

    }
}
