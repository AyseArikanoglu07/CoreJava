package day10_switch_StringManipulaton;

import java.util.Locale;

public class C04_charAt {
    public static void main(String[] args) {
        //Str de herhangibir karakteri almak istersek o karakterin indeksini kullanarak
        // str.charAt(istenenIndeks) yazabiliriz
        //STR de indeks sıfırdan baslar

        String str="Java Cok Guzel";
        //Jyi yazdiralim
        System.out.println(str.charAt(0));

        //G yi yazdirmak icin

        System.out.println(str.charAt(9));//J=0,a1,v2,a3,......,g9,bosluklar da bir karakter sayilir

        //va yazdiralim
        System.out.println(str.charAt(2)+ "" +str.charAt(3));
        //veya
        System.out.println(""+str.charAt(2)+str.charAt(3));

        //cOK

        System.out.println(""+str.toLowerCase().charAt(5)+
                ""+str.toUpperCase().charAt(6)+""+str.toUpperCase().charAt(7));
        //metod kullanmak istersek chardan once yazmaliyiz


        //son harfi yazdir
        //Str de 14 harf var, son harfin indeksi 14-1
        System.out.println(str.charAt(14-1));//uzunluk-1

        //eger uzunlugu indeks olarak girersek
        //java calistiktan sonra hata verir
        System.out.println(str.charAt(14));




    }
}
