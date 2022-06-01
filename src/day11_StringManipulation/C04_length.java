package day11_StringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_length {
    public static void main(String[] args) {

        //kullanicidan ismini alip bas harfini ve son harfini buyuk harflerle yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz : ");
        String isim=scan.nextLine();
        System.out.println("ilk harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-3));

        String str1="" ;
        System.out.println(str1.length());
        //String str2=null;(deger atamasi yapmadim ve farkindayim ki null yaziyorum)
        //System.out.println(str2.length());calistirilinca hata verir:
        //Exception in thread "main" java.lang.NullPointerException
        //	at day11_StringManipulation.C04_length.main(C04_length.java:20)
        String str2=null;
        System.out.println(str2);

        //String str3;
        //System.out.println(str3)=(deger atamadin ve farkiinda da degilsin);

        // str 3 ve str2 deger atanmamistirstr null pointer ile isaretlendiginden
        // java durumun kontrol altinda oldugunu bilir ve geriye kalan kodun calismasina engel olmaz
        // ancak str3 e bir deger atamasi olmayinca java altini kirmizi cizer
        //durum duzeltilinceye kadar kodun calismasina izin vermez





    }
}
