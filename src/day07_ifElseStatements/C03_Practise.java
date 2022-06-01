package day07_ifElseStatements;

import java.util.Scanner;

public class C03_Practise {
    public static void main(String[] args) {
        //Soru 1 kullanicidan bir tamsayi isteyin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("girilen sayi cift sayidir");
        }

        if (sayi % 2 != 0) {
            System.out.println("girilen sayi tek sayidir");
        }

        if (sayi % 2 == 0) {

            System.out.println("girdiginiz sayi tek sayidir");

        } else {
            System.out.println("girdiginiz sayi cift sayidir");
        }
    }
}