package day23_arrays;

import java.util.Arrays;

public class C01_MultiDimensionalArrays {
    public static void main(String[] args) {
        int arr[][]={{3,1,7},{6,10,2}};
        System.out.println(arr[0][2]);
        System.out.println(arr[1][1]);

        //ilk inner arrayin tum elementlerini

        System.out.println(arr[0]);//referansini yazdirir
        System.out.println(Arrays.toString(arr[0]));//[3,1,7]
        System.out.println(Arrays.toString(arr));//arr nin içinde iki farkli array old için
                                                 // her bir arrayin referansini yazdirir
        //MDArrayde tum elementleri bir array olarak yazdirmak istersek

        System.out.println(Arrays.deepToString(arr));
    }
}
