package day48_Collections;

import java.util.HashSet;
import java.util.Set;

public class C03_RetainAll {
    public static void main(String[] args) {

        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        set1.add(10);
        set1.add(20);
        set2.addAll(set1);
        set2.add(30);
        set2.add(27);
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set2.retainAll(set1));//set2ye git set1in elemanlari disinda ne varsa sil
        System.out.println(set1);
        System.out.println(set2);

    }
}
