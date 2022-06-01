package day50_Maps;

import day49_Maps.MapOlustur;

import java.util.*;

public class C01_Maps {
    public static <ilkValueArr> void main(String[] args) {
        //siniftaki ogrenci listesini duzenli olarak yazdiralim
        //her seferinde clastan cagirmak zorunda kalmamak icin method call assign edilmeli
        Map<Integer, String> sinifListMap = MapOlustur.myMap();
        System.out.println(sinifListMap);

        //indexle ulasilacak bir java yapisina dondurmek lazim
        Set<Integer> sinifKeySeti = sinifListMap.keySet();

        //ama hala index yapisiyla ulasamiyoruz,setteki elemanlari indexli bir yapiya atmaliyiz
        //Integer keyArr[]=new Integer[sinifKeySeti.size()];
        //*Arraye atmak icin arrayin hangi indexine atacagimizi bilmeliyiz,
        //bunun icin deayri bir index yapisi kullanilmasi gerekir.
        //bu sebeple daha esnek olan List i kullanmak daha dogru olur

        List<Integer> keyList = new ArrayList<>();
        //settaki butun key leri liste atalim,
        /*for (Integer each:sinifKeySeti
             ) {

            keyList.add(each);
        }*/

        //veya

        /*eger key lere tek tek ulasmak istersek index yapisina ihtiyacimiz var
        ancak map index yapisini desteklemez
        bunun icin once key leri bir sete sonra da setin tum elementlerini bir liste ekleriz*/

        keyList.addAll(sinifKeySeti);
        System.out.println(keyList);
        System.out.println(keyList.get(0));
        System.out.println(keyList.get(1));

        //valueleri indexle ulasabilecegimiz bir sekle sokalim

        Collection<String> sinifValueColl = sinifListMap.values();
        System.out.println(sinifValueColl);
        System.out.println(sinifValueColl.size());

        //value lere tek tek ulasabilecegimiz yollardan biri MDArray
        List<String> sinifValueList = new ArrayList<>();
        sinifValueList.addAll(sinifValueColl);
        System.out.println(sinifValueList);
        //listimiz hazir MD Arraye atacagiz
        /*
        her bir value birden fazla bilgiyi iceriyor, onun icin valueleri MD Arraye atmak mantikli duruyor
        ancak MDArray olusturmak icin boyutlari bilmeliyiz

         */

        int outerArrayBoyut = sinifValueList.size();//outer Arrayin boyutunu verir
        System.out.println(outerArrayBoyut);

        //inner Arraylerin boyutunu bulmak icin;
        String ilkValue=sinifValueList.get(0);
        System.out.println(ilkValue);
        String ilkValueArray[]=ilkValue.split(", ");//split ile Stringden cikaririz
        int innerArrayBoyut=ilkValueArray.length;

        //MDArrayde nested for loop yapmadan olmaz

        String valueMDArr[][]=new String[outerArrayBoyut][innerArrayBoyut];
        for (int i = 0; i <outerArrayBoyut ; i++) {
            String temp[]=sinifValueList.get(i).split(", ");
            for (int j = 0; j <innerArrayBoyut ; j++) {
                valueMDArr[i][j]=temp[j];
            }
        }
        System.out.println(Arrays.deepToString(valueMDArr));

        // bu satira kadar key'leri index ile ulasabildigim keyList' e atadim
        // value'leri valueMDArr'e atadim
        // simdi bu key ve value'leri istedigim gibi manuple edebilirim
        System.out.println("Numara  Isim   Soyisim  Brans");
        System.out.println("=============================");
        for (int i = 0; i <keyList.size() ; i++) {
            System.out.print( keyList.get(i)+ "   ");

            for (int j = 0; j < innerArrayBoyut; j++) {
                System.out.print(valueMDArr[i][j] + "   ");
            }
            System.out.println("");
        }
    }
}
