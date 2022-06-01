package day47_LinkedList;

import java.util.Set;
import java.util.TreeSet;

public class C05_ArraydenTekrarlariSilme<arr> {
    public static void main(String[] args) {

        //verilen bir arrayden tekrar eden elementleri silip
        //uniqe elementlerden olusan bir array haline donduren bir method yazin
        int arr[] = {1, 2, 36, 8, 5, 69, 46, 252, 3, 3, 6, 5, 5, 2, 4, 4, 7};
        arr = benzersizYap(arr);

    }

    private static int[] benzersizYap(int[] arr) {

        Set<Integer> benzersizSet = new TreeSet<>();
        for (Integer each:arr
             ) {
            benzersizSet.add(each);
            
        }
        System.out.println(benzersizSet);

return arr;
}



}
