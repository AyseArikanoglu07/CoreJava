package day11_StringManipulation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCAse {
    public static void main(String[] args) {
        String str="Java Güzeldir";
        //Biz String metotlarini arka arkay kullanabiliriz
        //Mesela 2.kelimenin ilk harfini kucuk yazdiralim

        //str.charAt(5); boyle yazdigimizda sonuc str degil char olacatir
        //dolayisiyla str de yapmak istedigimiz tum degisiklikleri
        //onve yapip sonra charAt() methodunu kullanmaliyiz

        System.out.println(str.toLowerCase().charAt(5));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("fr")));



    }

}
