package day25_List;

import java.util.Arrays;

public class C05_Array {
    public static void main(String[] args) {
        //verilen arrayden istenen elementi silip
        //kalanlari yeni array olarak yazdiran bir method olusturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenEleman=5;
        istenmeyenElementiSil(arr,istenmeyenEleman);
    }
    public static void istenmeyenElementiSil(int[] arr, int istenmeyenEleman) {

        //1-istenmeyen eleman sayisini bul
        int sayac=0;
        for (int i = 0; i< arr.length ; i++) {
            if (arr[i]==istenmeyenEleman)
            sayac++;
        }System.out.println(istenmeyenEleman);

        //2-yeni arrayi olusturtalim
        int arrYeni[]=new int[arr.length-sayac];
        System.out.println(Arrays.toString(arrYeni));

        //3-eski arrayden uygun elementleri yeniye tasi
        int index=0;
        for (int i = 0; i <arr.length  ; i++) {
            if (arr[i]!=istenmeyenEleman){
                arrYeni [index]=arr[i];
                index++;
            }
        }
        //4-listeyi yazdirin
        System.out.println(Arrays.toString(arrYeni));
    }

    

}
