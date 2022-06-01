package day33_varrargsStringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Ali Can");
        StringBuilder sb2=new StringBuilder("Aii can");
        String str="Ali Can";

        /*
        Compare iki sb yi kontrol etmek ilk harften baslayarak tum karakterleri karsilastirir
        ayni olan karakterler icin bişey yazdirmaz
        farkli olan ilk karakter icin ASCII tablosuna gore kac deger geride veya ileride oldugunu yazdirir
        tamamen ayniysa 0 yazdirir

         */

        System.out.println(sb1.compareTo(sb2));//karsilastirma
        //bir string builder ile bir stringi compare edersek java cte verir
        //System.out.println(sb1.compareTo(str));

        //Stringdeki == gibidir hem objeye hem referansa bakar
        System.out.println(sb1.equals(str));//hata vermez ama false doner
        //System.out.println(sb1==str);== farkli obje turleri old icin str ile sb karsilastirmaz

    }
}
