package day52_Maps;

import day49_Maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C01_EntrySet {
    public static void main(String[] args) {
        Map<Integer, String> sinifListMap=MapOlustur.myMap();
        System.out.println(sinifListMap);
        System.out.println(sinifListMap.entrySet());

        /*
        myMap methodu bize entry lerden olusan bir set dondurur.eger entryleri manipule etmek istersek
        methodun dondurdugu seti yeni bir set olusturup store etmeliyiz
        */

        Set<Map.Entry<Integer,String>> sinifEntrySet=sinifListMap.entrySet();

        System.out.println("No   Isim   Soyisim   Brans");

        for (Map.Entry<Integer,String> each :sinifEntrySet
             ) {
            Integer entryKey= each.getKey();
            String valueStr=each.getValue();

            String valueArr[]=valueStr.split(", ");
            System.out.printf("%4d %-6s %-9s " , entryKey, valueArr[0], valueArr[1] );
                              //4haneli digit,6haneli string,9haneli string,6haneli string,
                              // onune - koyarsak sola degilse saga yaslar


            
        }




    }
}
