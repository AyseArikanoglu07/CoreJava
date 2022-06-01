package day26_ForEachLoop_Constructor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        // 10 elementli bir list olusturalim
        int arr[]={2,5,4,6,4,9,7,1,3,10};
        //liste yerine
        List<Integer>sayilar=new ArrayList<>();
        for (int each: arr
             ) {sayilar.add(each);

        }
        System.out.println(sayilar);
        for (int each:sayilar
        ) {
            if (each%3!=0)
                System.out.print(each + " ");

        }//sayilar listesinde uçe bolunemeyen sayilari foreach loop ile yazdiralim
        //foreach loop ile sondan basa yazdirilamaz





    }
}
