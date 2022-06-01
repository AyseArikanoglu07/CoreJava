package day11_StringManipulation;

import java.util.Scanner;

public class C05_indexOf {
    public static void main(String[] args) {
        String str1="Java bir baska guzel valla cok guzel";

        //istersek char olarak bir harfin indexini dondurur
        System.out.println(str1.indexOf('J'));

        //istersek bir harf olarak verdigimiz Stringin indexini dondurur
        System.out.println(str1.indexOf("aska"));

        System.out.println(str1.indexOf("l"));
        System.out.println(str1.length()-1);
        // ayni harften birden fazla varsa?
        System.out.println(str1.indexOf("b"));// buldugu ilk dogru eslesmenin indeksini dondurur
        System.out.println( str1.indexOf('b', 5));
        // bu methodda java fromındex olarak yazdigimiz
        //inclusive
        //verilen str deki 2.a harfinin indexini bulalim
        int ilkindex=str1.indexOf('a');
        System.out.println(str1.indexOf('a',ilkindex+1));

        //verilen str deki 2.b harfinin indexini bulalim
        int ilkbindex=str1.indexOf("b");
        System.out.println(str1.indexOf("b",ilkbindex+1));

        //20.indexten sonra guzel aratalim
        System.out.println( str1.indexOf("guzel",20));

        //metinde stringde olmayan harf aratalim
        System.out.println(str1.indexOf("y"));
        //y yok demesi lazim ama return type i index olamaycak bir sayi doner
        //yok demenin sayisal karsiligi olarak java -1 dondurmeyi tercih etmistir
        //iceriyorsa mailiniz kabul edldi yazin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mail adresini yazin");
        String mail=scan.next();
        if (mail.indexOf("@")==(-1)){
            System.out.println("gecersiz");
        }else {
            System.out.println("mailiniz kabul edildi");
        }
        //OZET: index of methodu iceride yazilan str veya ch in metinde hangi indexte oldugunu bize dondurur
        //eger aradigimiz metin veya ch yoksa, olmadiginin delili olarak bize -1 dondurur








    }
}
