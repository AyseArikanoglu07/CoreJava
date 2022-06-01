package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C07_IfElseİfStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gun ismini yaziniz");
        String gunIsmi=scan.next().toLowerCase(Locale.ROOT);

        if (gunIsmi.equals("PAZAR")||gunIsmi.equals("CUMARTESİ")){
            System.out.println("girdiginiz gun haftasonu");


        }else if (gunIsmi.equals("PAZARTESİ")||gunIsmi.equals("SALI")||gunIsmi.equals("PERSEMBE")
                ||gunIsmi.equals("CUMA")||gunIsmi.equals("CARSAMBA"))

        {System.out.println("girdiginiz gun haftaici");}
            else {
                    System.out.println("lutfen gecerli bir gun ismi giriniz"); }
        }
    }





