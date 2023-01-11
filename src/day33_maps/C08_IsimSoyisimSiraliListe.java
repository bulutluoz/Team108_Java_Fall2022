package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C08_IsimSoyisimSiraliListe {
    public static void main(String[] args) {

        // tum ogrenci listesini isim soyisim no sinif sube bolum
        // seklinde sirali olarak yazdiran bir method olusturun

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.isimSoyisimSiraliListeYazdir(ogrenciMap);
    }
}
