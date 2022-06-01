package day21_arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int arr1[]={1,2,3};
        int[] arr2={1,2,3};
        int [] arr3={1,2,3};
        //3 farklı sekilde array deklare edilebilir
        //solda deklare ederken

        double arr4[]={1.5, 3.6, 2.7};
        //data turu variable(array) ismi ve koseli parantez yazarak array deklare edilir

        String arr5[]={"ayse" + "ayhan"};

        //assign mecburi midir
        int arr6[];//kabul eder ama
                   //kullanmak istenince kullanmadan once mutlaka deger atamasi gerekecek

        //hem deklare edip hem de atama yapacaksak nasıl yapmalı

        //1-deklare edip esitligin sagina suslu parantez icine degerleri yazabiliriz
        String arr7[]={"ayse" + "ayhan"};

        //2-***eger sadece olusturup icine deger atamak istemiyorsak, boyutunu belirlemek gerekir
        int arr8[]=new int[5];//kac int deger oldugunu belirtilmeli
                              //java icinde 5 default deger olan bir array olusturur
                              //[0,0,0,0,0]








    }

}
