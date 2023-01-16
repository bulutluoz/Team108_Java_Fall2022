package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C07_SinifaGoreSiraliListeYazdir {
    public static void main(String[] args) {

        // tum ogrenci listesini
        // sinif sube isim soyisim no seklinde
        // dogal sirali olarak
        // Yazdiran bir method olusturun

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.sinifSiraliListeYazdir(ogrenciMap);
        /*
        sinif sube isim   soyisim  no
        =============================
          10   H   Ayse   Can     104
          10   K   Sevgi  Can     106
          10   K   Veli   Cem     102
          11   H   Ali    Can     101
          11   K   Ali    Cem     103
          11   M   Sevgi  Cem     105
         */
    }
}
