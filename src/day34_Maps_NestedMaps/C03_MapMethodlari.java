package day34_Maps_NestedMaps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C03_MapMethodlari {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        System.out.println(ogrenciMap.containsValue("Ali")); // false
        // value degerinin tamami sorulursa true, bir parcasi sorulursa false doner

        System.out.println(ogrenciMap.getOrDefault(103, "Ogrenci bulunamadi"));
        // Ali-Cem-11-K-TM

        System.out.println(ogrenciMap.getOrDefault(123, "Ogrenci bulunamadi"));
        // Ogrenci bulunamadi

        System.out.println(ogrenciMap.get(123)); // null

        ogrenciMap.replace(103,"Ali-Cem-11-K-MF");

        System.out.println(ogrenciMap.get(103)); // Ali-Cem-11-K-MF

        ogrenciMap.put(103,"Ali-Cem-12-K-MF");

        System.out.println(ogrenciMap.get(103)); // Ali-Cem-12-K-MF


        System.out.println(ogrenciMap.replace(123, "Ali-Cem-12-K-MF")); // null

        System.out.println(ogrenciMap);


        ogrenciMap.replace(103,"Ali-Cem-12-K-MF","Ali-Han-12-K-MF");

        System.out.println(ogrenciMap.get(103)); // Ali-Han-12-K-MF

        ogrenciMap.replace(103,"Ali-Cem-12-K-MF","Kemal-Han-12-K-MF");

        System.out.println(ogrenciMap.get(103)); // Ali-Han-12-K-MF

        // kontrol eder, eski value verilen deger ile ayni ise degistirir, yoksa degistirmez



    }
}
