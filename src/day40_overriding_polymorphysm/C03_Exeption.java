package day40_overriding_polymorphysm;

import java.util.Scanner;

public class C03_Exeption {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("bolmek istediginiz sayiyi yaziniz: ");
        int sayi1= scan.nextInt();

        System.out.println("kaca bolmek istediginizi giriniz: ");
        int sayi2= scan.nextInt();

        if (sayi2==0){
            System.out.println(" sayi / 0 anlamsizdir ");

        }else  System.out.println("sonuc = " + sayi1/sayi2 );


    }
}