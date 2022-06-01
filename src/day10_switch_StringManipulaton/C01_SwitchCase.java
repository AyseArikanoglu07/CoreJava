package day10_switch_StringManipulaton;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {

        //kullanicidan sayi olarak kacinci ay oldugunu alip
        //istenen ay ismini yazdiran bir program yazdiriniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu giriniz:");
        int ayNo= scan.nextInt();

        //bu soruyu ifelse ile yapabiliriz ama art arda 12 ifelse cok kalabalik ve anlasilmasi guc olabilir
        //bunun yerine switchcas yapisini kullanabiliriz

        switch (ayNo) {
            case 1:
                System.out.println("Ocak");break;
            case 2:
                System.out.println("Subat");break;
            case 3:
                System.out.println("Mart");break;
            case 4:
                System.out.println("Nisan");break;
            case 5:
                System.out.println("Mayis");break;
            case 6:
                System.out.println("Haziran");break;
            case 7:
                System.out.println("Temmuz");break;
            case 8:
                System.out.println("Agustos");break;
            case 9:
                System.out.println("Eylul");break;
            case 10:
                System.out.println("Ekim");break;
            case 11:
                System.out.println("Kasim");break;
            case 12:
                System.out.println("Aralik");break;

            default:
                System.out.println("lutfen gecerli bir ay numarasi giriniz");

        //Switch icine yazilan variable in degerine gore
        //ilgili case bulur ve break gorene kadar kodu calistirir
        //eger break yoksa ilgili case de asagi dogru tum caseler calisir
        //ifelse deki son else gibi geriye kalan durumlari tamamen kapsayacak bir satir daha ekleyebiliriz



        }
    }
}
