package day24_List;

import day23_arrays.C06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_List {


    private static int eklenecekEleman;

    public static void main(String[] args) {
        int arr[]={};


        //bu array e 5 ekleyelim
        int i = 5;
        arr=C06_Arrays.arrayeElemanEkle(arr,eklenecekEleman=5);
        //static methodlarda class ismini yazıp nokta ile cagırınca
        // c06 classında olusturdugumuz arrayeElemanEkle geldi
        System.out.println(Arrays.toString(arr));//[5]

        //bir de 3 ekleyelim
        arr=C06_Arrays.arrayeElemanEkle(arr,eklenecekEleman=3);
        System.out.println(Arrays.toString(arr));//[5,3]

        //ArrayList olusturmak icin yazim soyledir:
        // ArrayList<String>list1=newArrayList<String>()
        // elmasin icine data turu yazilir , en cok su kullanilir
        // List<String>list3=new ArrayList<>()
        //esitligin saginda mutlaka ArrayList kullanilir
        //sout[list3); yazimiyla direk yazdirilir


        List<Integer> sayilarList=new ArrayList<Integer>();
        System.out.println(sayilarList);//[]
        sayilarList.add(5);
        sayilarList.add(3);
        sayilarList.add(8);
        sayilarList.add(0,7);
        sayilarList.add(2,7);

        System.out.println(sayilarList);

        //arraylistte lenght yoktur size vardir
        //is empty methodu RrrayList bos ise true dolu ise false doner



















    }
}
