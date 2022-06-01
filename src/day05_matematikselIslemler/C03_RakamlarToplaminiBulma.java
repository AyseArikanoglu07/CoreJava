package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {

        //kullanicidan aldiginiz 4 basamakli bir sayinin basamaklardaki rakamlar toplamini bulunuz

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir tam sayi giriniz:");

        int sayi=scan.nextInt();
        int rakam=0;
        int rakamlarToplami=0;

        //1. adim rakam 0 rakamlar top 0 sayi 7532
        rakam=sayi%10;//2
        rakamlarToplami+=rakam;//2
        sayi/=10;//753

        //2.adim r=2 rt=2 sayi 753

        rakam=sayi%10; //3
        rakamlarToplami += rakam; //5
        sayi/=10;//75

        //3.adim r=3 rt=5 sayi=75

        rakam=sayi%10; //5
        rakamlarToplami += rakam; //10
        sayi/=10; //7

        rakam=sayi%10; //7
        rakamlarToplami +=rakam;//17
        sayi/=10; //0

        System.out.println("girdiginiz sayinin rakamlar toplami:" + rakamlarToplami);


        /*
        10.03.2022 denedim
        int sayi=scan.nextInt();
        int rakam=0;
        int rakamlarToplami=0;

        (yuzde 10 yaparak sayilarin birler basamagini buluruz)
        (bir sayinin rakamlar toplamini bulmak icin sayinin basamak adedince asagidaki islemler yapilir)

        rakam=sayi%10;//sayinin 10 a bolumunden kalan=2 ,
        rakamlarToplami+=rakam;//2
        sayi/=10;//scan ile girilen sayinin 10 a bolumu=753
        System.out.println(rakam+","+rakamlarToplami+","+ sayi );

        rakam=sayi%10;//3
        rakamlarToplami+=rakam;//ilk satirdaki rakamlarToplami + 3 =5
        sayi/=10;//75
        System.out.println(rakam+ "," +rakamlarToplami+","+sayi);

        rakam=sayi%10;//5
        rakamlarToplami+=rakam;//ikinci satirdaki rakamlarToplamş + 5 =10
        sayi/=10;//7
        System.out.println(rakam+"," +rakamlarToplami+ "," +sayi);

        rakam=sayi%10;//7
        rakamlarToplami+=rakam;//ucuncu satirdaki rakamlarToplami + 7= 17
        sayi/=10;//0
        System.out.println(rakam + "," +rakamlarToplami+ "," +sayi);*/







    }
}
