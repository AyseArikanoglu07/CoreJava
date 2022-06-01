package day22_arrays;

import java.util.Arrays;

public class C06_BinarySearch {

    public static void main(String[] args) {

        //array de contains methodu yok!!!

        //eger javadan hazir BinarySearch methodunu kullanmak istersek
        //once sart methodunu kullanip sonra BinarySearch yapmaliyiz
        //binarySearch methodu bize istenen sayinin oldugu indexi verir


        int arr[]={3,5,6,1,9,45,25,4,9,0};
        int istenenSayi=-10;

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));//[0,1,3,4,5,6,9,9,25,45]
        System.out.println(Arrays.binarySearch(arr,istenenSayi));//2, bize istedigimiz elementin indexini doner


        //eger olmayan bir elemnti aratirsak;
        //java bulamadigini gostermek icin - isareti koyar
        //sonra da o sayi olsaydi siralamasi ne olacaktı ise indexi degil o sırayı bize verir


    }
}
