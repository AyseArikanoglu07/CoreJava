package day24_List;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove1 {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(8);
        sayilar.add(0,7);
        sayilar.add(2,7);
        System.out.println(sayilar);
        sayilar.remove(3);
        System.out.println(sayilar);
        //sayilar.remove(5);Index 5 out of bounds for length 4
        //System.out.println(sayilar);

        //int sayi=5;
        //sayilar.remove(sayi);Index 5 out of bounds for length 4
        //System.out.println(sayilar);

        Integer sayi=5;//Integer Wrapper Classı kullaninca primitive data degil obje old icin remove islemini yapar
        sayilar.remove(sayi);
        System.out.println(sayilar);

    }
}
