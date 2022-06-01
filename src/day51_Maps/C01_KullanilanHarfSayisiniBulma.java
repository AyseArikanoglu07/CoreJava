package day51_Maps;

import java.util.HashMap;
import java.util.Map;

public class C01_KullanilanHarfSayisiniBulma {
    public static void main(String[] args) {
        //verilen Stringdeki harfleri ve harflerin kacar kez kullaildigini return eden bir method yaziniz
        //input:Helllloooooo output:H=1, e=1, l=2, o=3

        String input="Helllloooooo";
        String harflerArr[]=input.split("");

        Map<String,Integer> kullanimSayilari= new HashMap<>();
        for (String each:harflerArr
             ) {
            if (kullanimSayilari.containsKey(each)){
                kullanimSayilari.put(each, kullanimSayilari.get(each)+1);
            } else {
                kullanimSayilari.put(each, 1);

            }

        }

        System.out.println(kullanimSayilari);


    }
}
