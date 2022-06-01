package day49_Maps;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDuzenliYazdirma {
    public static void main(String[] args) {
        //sinif listesini duzenli sekilde yadirmak
        Map<Integer,String> sinif=MapOlustur.myMap();
        System.out.println(sinif);
        sinifListYazdir(sinif);

    }

    public static void sinifListYazdir(Map<Integer, String> sinif) {
        System.out.println("Numara, Isim, Soyisim, Brans ");
        System.out.println("=============================");

        //Map yapisindan yazdşrdşgşmşzda kullanicilar bisey anlamayabilir
        //once map yazisini kodlarla manipule edip
        //map deki datalari,istedigimiz formata sokmamiz gerekir

        //1.adim key ve value lari mapden alip iki farkli collection uyesine atadik
        Set<Integer> keySet=sinif.keySet();
        Collection<String> valueSet=sinif.values();
        System.out.println(keySet);
        System.out.println(valueSet);
        for (String each:valueSet
             ) {
            System.out.println(each);
            
        }



    }

}
