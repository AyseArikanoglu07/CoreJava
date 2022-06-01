package day26_ForEachLoop_Constructor;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop_Sorular {
    public static void main(String[] args) {
        //iki String array olusturunuz ve bu array’lerdeki ortak elemanlari
        //For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
        //Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz

        String arr1[]={"ali","ayse","can","fatma"};
        String arr2[]={"can","evren","emsal","fatma","ayhan","ali"};
        List<String>ortakElemanlar=new ArrayList<>();
        //iki arrayi karsilastirmak icin içiçe iki loop ile yapmaliyiz
        for (String each1:arr1//arr1 deki her bir String
             ) {
            for (String each2:arr2//arr2 deki her bir string
                 ) {
                if (each1.equals(each2)){//each1 ile each2 elemanlar esitse listeye ekliyor
                    ortakElemanlar.add(each1);//veya each2 farketmez ortak elemanı alır
                }

            }
        }//for eachın dısında yazdirmaliyiz

        if (ortakElemanlar.isEmpty()){
            System.out.println("ortak eleman yok");
        }else System.out.println("iki arraydeki ortak elemanlar : "+ortakElemanlar);

    }
}
