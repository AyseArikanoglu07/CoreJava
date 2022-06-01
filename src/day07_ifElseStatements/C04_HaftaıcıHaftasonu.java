package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_HaftaıcıHaftasonu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun ismini yaziniz");

        String gunIsmi= scan.next().toUpperCase(Locale.ROOT);

        if (gunIsmi.equals("PAZAR")||gunIsmi.equals("CUMARTESİ"));        {
            System.out.println("girdiginiz gun haftasonu");
        }

        if(gunIsmi.equals("PAZARTESİ")||gunIsmi.equals("SALI")||gunIsmi.equals("PERSEMBE")||gunIsmi.equals("CUMA")||gunIsmi.equals("CARSAMBA"))
        {
            System.out.println("girdiginiz gun haftaici ");
        }







    }
}
