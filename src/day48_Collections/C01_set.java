package day48_Collections;

import java.util.HashSet;
import java.util.Set;

public class C01_set {
    //verilen bir arrayin tekrar eden elementlerini sadece bir kere yazdiran bir method olusturunuz
    public static void main(String[] args) {

Integer arr[]={1,3,5,7,3,6,2,36,1,1,5,3,3,6};
        arrayiTekrarsizYazdir(arr);
    }

    private static void arrayiTekrarsizYazdir(Integer[] arr) {

        Set<Integer> tekrarsizElementKumesi=new HashSet<>();
        for (Integer each: arr
             ) {
            tekrarsizElementKumesi.add(each);

        }
        System.out.println(tekrarsizElementKumesi);

    }
}
