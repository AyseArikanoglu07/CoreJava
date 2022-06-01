package day03_scanner;

import java.util.Scanner;

public class C04_scannerJava {
    public static void main(String[] args) {

        // Scanner kullanmak icin 3 adim takip ediyoruz
        // 1. adim kendimize bir scanner olusturmak
        Scanner scan= new Scanner(System.in);

        // esitligin saginda yeni bir scanner olusturulur ve olusturulan bu scanner scan variable'na assign edilir
        // scan variable'in ismidir, istedigimiz ismi verebiliriz
        // 2. adim  : Kullanicidan istedigimiz degeri girmesi icin aciklayici bir bilgi yazdirin

        System.out.println("Lutfen Isminizi Giriniz");

        // 3.adim kullanicinin girdigi degeri uygun bir variable olusturup kaydedin
        // String kullaniciIsmi= scan.next(); // SADECE ilk kelimeyi alir (ilk space'e kadar olan bolumu alir)


        String kullaniciIsmi=scan.next();
        System.out.println(kullaniciIsmi);//Zuleyha veya ZuleyhaKozan

        //nextLine ile de soyle olur

        String kullaniciIsmi1=scan.nextLine(); // satir sonuna kadar girilen tum degerleri alir

        System.out.println("Kullanicinin girdigi isim : " + kullaniciIsmi1);//Zuleyha Kozan





    }
}
