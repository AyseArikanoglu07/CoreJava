package day24_List;

import java.util.ArrayList;
import java.util.List;

public class C05_GetIndex {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(8);
        sayilar.add(0,7);
        sayilar.add(2,7);


        sayilar.get(2);
        System.out.println(sayilar.get(2));
        System.out.println(sayilar);


    }
}
