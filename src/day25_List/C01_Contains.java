package day25_List;

import java.util.ArrayList;
import java.util.List;

public class C01_Contains {
    public static void main(String[] args) {
        List<String> Harfler=new ArrayList<>();
        Harfler.add("D");
        Harfler.add("M");
        Harfler.add(1,"T");
        Harfler.add(0,"T");
        System.out.println(Harfler);
        System.out.println(Harfler.contains("S"));
        System.out.println(Harfler.contains("M"));

        List<String> Karakterler=new ArrayList<>();
        Karakterler.add("T");
        Karakterler.add("M");
        Karakterler.add("t");
        System.out.println(Harfler.containsAll(Karakterler));





    }
}
