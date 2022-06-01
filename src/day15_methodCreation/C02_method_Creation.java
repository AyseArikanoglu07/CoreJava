package day15_methodCreation;

import java.util.Scanner;

public class C02_method_Creation {
    public static void main(String[] args) {
        //kullanıcıdan bir kelime isteyin
        //kelime 3 harften kısyasa kelime çok kısa yazdırın
        //kelime 3,4,5 harfli ise hsrf sayısını ve kelimenin tersten yazılısını yazdırın
        //eger 5 harften uzunsa kelime çok uzun yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz : ");
        String kelime = scan.next();
        int harfSayisi = kelime.length();

        if (harfSayisi == 3) {
            System.out.println("kelime cok kisa");
        } else if (harfSayisi == 3) ;
}
}
