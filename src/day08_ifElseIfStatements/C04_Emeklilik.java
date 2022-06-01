package day08_ifElseIfStatements;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz" +
                "\nKadin icin K \nerkek icin E harfini giriniz");
        //uzun satirlari asagi atmak icin cift tirnak icine \n yazilir

        char cinsiyet = scan.next().toUpperCase().charAt(0);//charAt(0) girilen kelimenin ilk harfini alir

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'K') {

            if (yas < 0 || yas > 120) {
                System.out.println("Lutfen ");
            } else if (yas < 60) {
                System.out.println("emekli olamazsin \nDaha " + (60 - yas) + " yil calisman gerekir");
            } else {
                System.out.println("emekli olabilirisin");
            }
        } else if (cinsiyet == 'E') {

            if (yas < 0 || yas > 120) {
                System.out.println("Lutfen ");
            } else if (yas < 60) {
                System.out.println("emekli olamazsin \nDaha " + (60 - yas) + " yil calisman gerekir");
            } else {
                System.out.println("emekli olabilirisin");
            }
            {


            }
        }
    }
}