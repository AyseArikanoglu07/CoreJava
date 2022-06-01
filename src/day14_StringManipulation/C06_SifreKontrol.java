package day14_StringManipulation;

import javax.swing.*;

public class C06_SifreKontrol {
    public static void main(String[] args) {

        //kullanicicdan sifre isteyin
        //asagidaki sartlari sagliyorsa "sifre basari ile tanimlandi" yazdirin
        //sartlari saglamazsa "islam basarisiz, Lutfen yeni bir sifre girin" yazdirin
        //-ılk harfbuyuk harf olmali
        //-son harf kucuk harf olmalı
        //-


        //if body lerini bagımsız yaparsan tek seferde tum kontrolleri yapar

        String sifre = "asdf12345";

        boolean ilkHarf = false;
        if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
            ilkHarf = true;
        } else {
            System.out.println("sifrenizin ilk harfi Buyuk Harf olmali");
        }


        boolean sonHarf = false;
        if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
            sonHarf=true;
        } else {
            System.out.println("Sifrenizin son harfi kucuk harf olmali");
        }

        boolean bosluk=false;
        if (!sifre.contains("")) {
            bosluk = true;
        }else {
            System.out.println("sifre bosluk icermemeli");
        }

        boolean uzunluk=false;
        if (sifre.length()>=8)  {
            uzunluk = true;
        }else {
            System.out.println("Sifre en az 8 karakter olmali");
        }

        if (ilkHarf && sonHarf && bosluk && uzunluk){
            System.out.println("sifreniz basarili bir sekilde kaydedildi");
        }

    }
}
