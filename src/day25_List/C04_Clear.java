package day25_List;

import java.util.ArrayList;
import java.util.List;

public class C04_Clear {
    public static void main(String[] args) {

        List<String> hayvan=new ArrayList<>();
        hayvan.add("yilan");
        hayvan.add("kedi");
        hayvan.add("tavsan");
        System.out.println(hayvan.isEmpty());
        System.out.println(hayvan.size());
        hayvan.clear();
        System.out.println(hayvan);
        System.out.println(hayvan.isEmpty());
        System.out.println(hayvan.size());


    }
}
