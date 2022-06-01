package day03_scanner;

import java.util.Scanner;

public class Variables_Scannner_Practice {
    public static void main(String[] args) {

        //1.ders
        // 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin

        String Okulismi="Yildiz Koleji";
        char ilkHarf='A';
        int sayi1=10 , sayi2=20;


        System.out.println(Okulismi);//Yildiz Koleji
        System.out.println(ilkHarf);//A
        System.out.println(sayi1+sayi2);//30

        //2- isim ve soyisim icin iki variable olusturun ve bunlari
        //  isminiz : Mehmet
        //  soyisminiz : Bulutluoz
        //  seklinde yazdirin


        String isim="Ayse";
        String soyisim="Okur Arikanoglu";
        System.out.println("isminiz:" + isim );
        System.out.println("soyisminiz:" + soyisim );

        //3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin
        //4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
        //5 – char data turunde bir variable olusturun ve yazdirin


        short dk1=30;
        double dk2=40.32;
        System.out.println(dk1+dk2);
        System.out.println("toplam sure:" + (dk1+dk2));
        System.out.println("toplamsure:" + dk1+dk2);

        //6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.

        int sayi=53;
        char symbol='c';
        System.out.println(sayi+symbol);

        int sayi6='a';
        System.out.println(sayi6);

        // char data turundeki degiskenler matematetiksel islemlerde kullanilirsa
        // o char degerinin ASCII karsiligi isleme alinir

        //2.ders
                /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        bir program yaziniz
         Orn    : sayix=10 ve sayiy=20;
          kod calistiktan sonra
         sayix=20 ve sayiy=10
         */

        int sayix=10;
        int sayiy=20;
        System.out.println("Swaptan once sayix;" +sayix  + ",sayiy;" +sayiy);//x=10 y=20

        // 1.adim bos bir variable olusturup
        // sayix'i ona atayalim


        int temp=sayix;//temp=10
        System.out.println(temp);

        //temp=10 sayiy=20

        // 2.adim sayix'e yeni degerini atayalim

        sayix=sayiy;
        System.out.println(sayix);

        //sayix=20

        // 3. adim sayiy'ye temp'e yedekledigimiz sayix degerini atayalim

        sayiy=temp;
        System.out.println(sayiy);

        //sayiy=10


        System.out.println("Swaptan sonra sayix:"+ sayix  + ",sayiy"+ sayiy);

        //3.ders

        //Variables temp olmadan ornek
        /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini
        ucuncu bir variable kullanmadan degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */

        int sayia=10;
        int sayib=20;
        System.out.println("Swaptan once sayia:"+ sayia + ",sayib:"+ sayib  );

        System.out.println(sayia=(sayia+sayib));
        System.out.println(sayib=(sayia-sayib));
        System.out.println(sayia=(sayia-sayib));
        System.out.println("Swaptan sonra sayia:"+ sayia + ",sayib:" + sayib );

        //4.ders
        // Scanner kullanmak icin 3 adim takip ediyoruz
        // 1. adim kendimize bir scanner olusturmak

        Scanner scan = new Scanner(System.in);

        // esitligin saginda yeni bir scanner olusturulur ve olusturulan bu scanner scan variable'na assign edilir
        // scan variable'in ismidir, istedigimiz ismi verebiliriz
        // 2. adim  : Kullanicidan istedigimiz degeri girmesi icin aciklayici bir bilgi yazdirin

        System.out.println("Lutfen isminizi giriniz:");
        String kullaniciIsmi= scan.next();
        System.out.println(kullaniciIsmi);//zuleyha


        // 3.adim kullanicinin girdigi degeri uygun bir variable olusturup kaydedin
        // String kullaniciIsmi= scan.next(); // SADECE ilk kelimeyi alir (ilk space'e kadar olan bolumu alir)

        String kullaniciAdi= scan.nextLine();// satir sonuna kadar girilen tum degerleri alir
        System.out.println("kullanicinin girdigi isim:" + kullaniciAdi);//kullanicinin girdigi isim:zuleyha kozan

        //5.ders

        //Soru 3) Kullanicidan yaricap isteyip
        // cemberin cevresini ve dairenin alanini hesaplayip yazdirin



























    }
}
