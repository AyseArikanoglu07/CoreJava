package day08_ifElseIfStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {
        //girilen birn karakterin, harfb olup olmadigini bulalim
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");

        char karakter=scan.next().charAt(0);

        if ((karakter >='A' && karakter<='Z') || (karakter>='a' && karakter<='z')) {
            System.out.println("Girdiginiz karakter bir harf");
        } else {
            System.out.println("Girdiginiz karakter bir harf degil");
        }

        Character.isLetter(karakter);
        System.out.println(karakter);



    }



}
