package day08_ifElseIfStatements;

import java.util.Scanner;

public class C03_alternartifNotuHarfeCevirme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz:");
        double notSayi = scan.nextDouble();
        if (notSayi < 0 || notSayi > 100)
        {System.out.println("lutfen gecerli bir not girin");}

        else if (notSayi < 50)
        {System.out.println("notunuz D"); }
        else if (notSayi < 60)
        {System.out.println("notunuz C");}
        else if (notSayi < 80)
        {System.out.println("notunuz B");}
        else {System.out.println("notunuz A");}

    }
}



