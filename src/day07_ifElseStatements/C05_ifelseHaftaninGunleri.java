package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C05_ifelseHaftaninGunleri {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun ismini yaziniz");
        String gunIsmi= scan.next().toUpperCase(Locale.ROOT);

        if (gunIsmi.equals("PAZAR")||gunIsmi.equals("CUMARTESİ"))       {
            System.out.println("girdiginiz gun haftasonu");
        }else {
            System.out.println("girdiginiz gun haftaici");}
    }
}
