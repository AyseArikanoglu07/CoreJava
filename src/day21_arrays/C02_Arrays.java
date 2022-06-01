package day21_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String arr1[] = {"ali", "veli", "ayse"};
        //array icindeki elementlere ulasabilmek icin index kullanilir,
        System.out.println(arr1[0]);
        arr1[1]="ayhan";
        System.out.println(arr1[1]);
        //arrayin icindeki indeksi kullanarak elementlere ulasabilir ve update edebiliriz

        int arr2[]=new int[4];
        System.out.println(arr2[1]);//0 verir
        System.out.println(arr2[2]);//0 verir
        //System.out.println(arr2[5]);//hata verir

        System.out.println(arr2);//non primitive old icin
                                 // stack memoryye gider array in referansını yazdırır;[I@5b464ce8

        for (int i = 0; i <4 ; i++) {
            System.out.println(arr2[i]+ " ");

            System.out.println();

            //array yazdirmak icin javadaki Arrays classından toString() methodu kullaniriz
            System.out.println(Arrays.toString(arr2));
            arr2[1]=11;
            arr2[3]=22;
            System.out.println(Arrays.toString(arr2));//0, 11, 0, 22

            System.out.println(Arrays.toString(arr1));


            
        }





    }
}