package day48_Collections;

import java.util.HashSet;
import java.util.Set;

public class C02_HashCode {
    public static void main(String[] args) {

        String str="Java cok guzel";
        System.out.println(str.hashCode());
        String str2="Hava cok guzel";
        System.out.println(str2.hashCode());

        Set<Integer> sayiKumesi=new HashSet<>();
        sayiKumesi.add(10);
        System.out.println(sayiKumesi.hashCode());



    }
}
