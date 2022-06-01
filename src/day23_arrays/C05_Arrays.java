package day23_arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //verilen bir arraye yeni bir element ekleyen bir method olusturun

        int arr[]={3,5,7};
        //arr[3]=8;arrayde olmayan bir indexe atama yapamayiz

        //arr={1,3,5,6};var olan bir arraye icinde ayni boyutta bile olsa
        // direk yeni degerler iceren bir array atayamayiz

        arr=new int[4];
        //int arr1[]={1,3,5,7};
        System.out.println(Arrays.toString(arr));

        int arrYeni[]=new int[5];
        arr=arrYeni;//eski arr ye arryeni yi atayinca
        System.out.println(Arrays.toString(arr));

        arrYeni[0]=2;
        arrYeni[3]=5;
        arr=arrYeni;
        System.out.println(Arrays.toString(arr));

        //bir arraye icinde hazir elementlerin oldugu yeni bir array atamak isterseniz
        // {1,2,3} seklinde yazarak degil, new int[3] seklinde olusturup sonra deger atayarak tamamladigimiz
        // bir arrayi assign ederek yapabiliriz

        int arrEnYeni[]={1,2,3,4,5};
        arr=arrEnYeni;
        System.out.println(Arrays.toString(arr));




    }
}
