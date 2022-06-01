package day03_scanner;

import java.util.Scanner;

public class VariablesScannerPractise {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        //Soru 3) Kullanicidan yaricap isteyip
        // cemberin cevresini ve dairenin alanini hesaplayip yazdirin

        System.out.println("Lutfen cemberin yaricapini giriniz:");

        Double yaricap= scan.nextDouble();

        System.out.println("girdiginiz yaricap:"+yaricap);
        System.out.println("cemberin cevresi:"+ 2*3.14*yaricap);
        System.out.println("dairenin alani:"+ 3.14*yaricap*yaricap);



    }
}
