package day23_arrays;

public class C03_MDArrays {
    public static void main(String[] args) {
        //boyutları belirli bir arrayi elementlere girmeden olusturalim
        //bir okulda icinde 24 ogrenci olan 8 sinif vardir
        int arr[][]=new int[8][24];

        //bir i,lcede herbirinde 24 ogrencilik 8 sınıf bulunan 5 okul vardır
        int ilce[][][]=new int[5][8][24];

        //bir okulda uc tane 24 kisilik 2 tane 22 kisilik sınıf vardır
        int sinif24[][]=new int[3][24];
        int sinif22[][]=new int[2][22];

        //olustururken elementleri atama yaparsak farkli uzunlukta inner arrays tanimlayabiliriz
        int arr1[][]={{3,1,7,5} , {6,10}};




    }
}
