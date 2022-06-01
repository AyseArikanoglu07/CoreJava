package day11_StringManipulation;

public class C02_equals {
    public static void main(String[] args) {
        String str1="Ali Can";
        String str2="Ali " + "Can";
        System.out.println("str1 :" + str1);
        System.out.println("str2 :" + str2);

        System.out.println("==ile karsilastir " + (str1==str2));
        System.out.println("equals ile karsilastir: " + str1.equals(str2));

        String str3=str1+"";
        System.out.println("str3 : " +str3);
        System.out.println("== ile karsilastir " + (str3==str2));
        System.out.println("equals ile karsilastir : " + str3.equals(str2));

        //Stringde == her zaman dogru sonuc vermez
        //bunun icin emin oldugumuz equals methodunu kullaniriz
        //str. yazinca equals metodu gelir
        String str5="hasan";
        String str6="HASAN";
        System.out.println("hasan:" + str5.equals(str6));//buyuk kucuk harf duyarlidir false olur
        System.out.println("HASAN:" + str5.toUpperCase().equals(str6));

    }
}
