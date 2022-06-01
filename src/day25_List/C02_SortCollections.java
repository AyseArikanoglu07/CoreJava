package day25_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_SortCollections {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Oguzhan");
        isimler.add("Berk");
        System.out.println(isimler);
        Collections.sort(isimler);
        System.out.println(isimler);


    }
}
