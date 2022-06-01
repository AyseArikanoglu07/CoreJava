package day52_Maps;

import day49_Maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C02_Update {

    //verilen mapdeki tum branslari java yapalim
    /*
    map de value komplex olabildigi icin value icerisinden bir bolumu degistirmek istersek
    once value ya ulasmak sonra da onu manipule ederek istedigimiz degisikligi yapmak ve en son degismis halini
    map e eklemek gerekir
     */


    public static void main(String[] args) {
        Map<Integer,String> sinifListMap= MapOlustur.myMap();
        System.out.println(sinifListMap);
        Set<Map.Entry<Integer,String>> sinifEntrySet=sinifListMap.entrySet();
        for (Map.Entry<Integer,String> each:sinifListMap.entrySet()
             ) {
            Integer keyEntry=each.getKey();
            String valueEntry=each.getValue();
            String valueArr[]=valueEntry.split(", ");
            valueArr[1]="Java";


            String valueYeni=valueArr[0] + ", " + valueArr[1]  ;
            sinifListMap.put(keyEntry,valueYeni);
            
        }
        System.out.println(sinifListMap);
        
        
        
        
    }
}
