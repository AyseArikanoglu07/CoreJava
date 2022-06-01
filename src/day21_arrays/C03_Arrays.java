package day21_arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        int arr[];//deger atamasi yapmadik ama java kabul etti
        //System.out.println(Arrays.toString(arr));
        // ancak kullanmaya izin vermez
        // Array in defaultu olmaz

        //arr={1,2,3};uzunluk belirtilmedigi icin kabul etmez
        arr=new int[6];
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);//Stringdekşi gibi length() yok

        //Array deki her bir elemanı index degeri kadar artiralim

        for (int  i= 0; i<arr.length ; i++) {
            arr[i]+=i;

        }
        System.out.println(Arrays.toString(arr));

        //son indexteki elementi yazdiralim

        System.out.println(arr[arr.length-1]);
        


    }
}
