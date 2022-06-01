package day52_Maps;

import java.util.HashMap;
import java.util.Map;

public class C03_MapsMethodlari {
    public static void main(String[] args) {
        Map<String,Integer> myMap=new HashMap<>();
        myMap.put("H",3);//kontrol etmeksizin eskş H yerine yenisini koyar
        myMap.putIfAbsent("K",5);//once kontrol eder eski H yoksa ekler,varsa

        /*
        Bir ekleme yapmak istersek Key daha once eklenmemisse mape eklesin
        daha onceden eklenmisse , eskiyi silmemek icin bizi uyarsin
         */

        System.out.println(myMap.putIfAbsent("A",6));

        if (myMap.putIfAbsent("K",20)!=null){
            System.out.println("girilen key mapte zaten var");
        }
        System.out.println(myMap.putIfAbsent("K",20));
        System.out.println(myMap);

        myMap.put("A",10);
        System.out.println(myMap);
        myMap.computeIfAbsent("A",v->20);//ne yapmasini istedigimiz soylemeliyiz
        System.out.println(myMap);
        
        myMap.compute("A",(key,value)->20);
        System.out.println(myMap);

        //Hnin degerini 2 katinin 5 fazlasi yapalim
        myMap.compute("H",(key,value)->(2*value+5));
        System.out.println(myMap);


    }
}
