package day22_arrays;

import java.util.Arrays;

public class C04_TerstenSiralayipKaydetme {
    public static void main(String[] args) {

        int arr[]={3,5,6,1,9,45,25,4,9};

        //int arr2[]=new int[arr.length];
        //arr2=arr;
        //System.out.println(Arrays.toString(arr2));

        //int tersArr[]=new int[arr.length];
        arr=terstenSiraliHaleCevir(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("en buyuk element : " + arr[0]);

    }
 public static int[] terstenSiraliHaleCevir(int[] arr) {
     Arrays.sort(arr);
     int tersArr[]=new int[arr.length];
     System.out.println(Arrays.toString(arr));
     System.out.println(Arrays.toString(tersArr));

     for (int i = 0; i <arr.length; i++) {
         tersArr[i]=arr[arr.length-1-i];
         System.out.println(Arrays.toString(tersArr));

     }
     return tersArr;

    }


}
