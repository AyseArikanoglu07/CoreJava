package day25_List;

import java.util.ArrayList;
import java.util.List;

public class C03_Equalls {
    public static void main(String[] args) {

        List<String> yillar=new ArrayList<>();
        List<String> aylar=new ArrayList<>();
        yillar.add("2022");
        yillar.add("2023");
        yillar.add("2071");
        aylar.add("eylul");
        aylar.add("mayis");
        aylar.add("mart");
        System.out.println(yillar);
        System.out.println(aylar);
        System.out.println(yillar.equals(aylar));
    }
}
