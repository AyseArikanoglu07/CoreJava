package day49_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {

        /*Javada Collection uyesi bir yapida data turu Object secilirse her data turunden deger ekleyebiliriz
        ancak surekli casting problemi yasanabilir
         */

        List<Object> list=new ArrayList<>();
        list.add("Ergin");
        list.add(15);
        list.add(10.2);
        System.out.println(list);
        list.set(1,(Integer)(list.get(1))+10);//objecti index uzerinden artirmak istersek casting yapmaliyiz

        //Map abstract tir bu sebeple obje olusturulamaz, hashmap kullaniriz
        //bir sinifta ogrenci no,isim soyisim ve brans olarak map olusturmak istiyoruz
        //siralamaya dikkat edilmeli
        //key tek bir unique degerdir ama value birden fazla bilginin birlesiminden olusabilir
        //bu durumda daha sonra istedigimiz bilgilere dogru sekilde ulasabilmek icin
        //tum elementler icin value ayni sekilde olusturulmalidir

        Map<Integer,String> sinifList=new HashMap<>();
        sinifList.put(101,"Ali, Can, Dev");
        sinifList.put(102,"Veli,Yan, QA");
        sinifList.put(103,"Ali, Yan, Dev");
        System.out.println(sinifList);
        System.out.println(sinifList.keySet());//key ler uzerinde degisiklik yapmak,set etmek istersek
        System.out.println(sinifList.values());//values yazdirir containsvalues boolean dondurur




    }
}
