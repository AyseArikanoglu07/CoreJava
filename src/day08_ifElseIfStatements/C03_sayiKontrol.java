package day08_ifElseIfStatements;

import java.util.Scanner;

public class C03_sayiKontrol {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //System.out.println("Lutfen iki sayi giriniz");msj yazilmasa da kod calisir
        System.out.println("Lutfen iki sayi giriniz");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        if (sayi1 > 0 && sayi2 > 0) ;
        {System.out.println("girdiginiz iki sayi da pozitif old icin toplamlari=" + (sayi1 + sayi2)); }
        if (sayi1 < 0 && sayi2 < 0) ;
        {System.out.println("girdiginiz iki sayi da negatif old icin carpimlari=" + (sayi1 * sayi2)); }
    }
    }



