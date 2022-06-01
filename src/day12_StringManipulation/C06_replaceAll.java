package day12_StringManipulation;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {

        //regular expressions kullanilabilir
        //  \\s : bosluk(space) , \\S : (Space olmayan tum karaterler) ,
        //  \\w :harfler ve rakamlar , \\W : harfler ve rakamlar disindaki hersey
        //  \\d :rakamlar(0-9) , \\D : rkamlar disindaki tum karakterler

        //kullanicidan isim soyisim bilgisini alip butun harfleri yildiz yapiniz

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isim soyisim giriniz: ");
        String isimSoyisim= scan.nextLine();
        System.out.println(isimSoyisim.replaceAll("\\s" , "."));





    }
}
