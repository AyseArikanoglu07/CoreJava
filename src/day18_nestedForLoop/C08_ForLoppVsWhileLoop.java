package day18_nestedForLoop;

import java.util.Scanner;

public class C08_ForLoppVsWhileLoop {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        /*for (int i = 1; i <=1000000; i++) {
            System.out.println("lutfen bir sayi giriniz ");
            sayi= scan.nextInt();

            if (sayi==0){
                break;

            }else{
                toplam+=sayi;
            }

        }
        System.out.println(toplam);*/

        //baslangic,bitis ve degisim degerleri net ise for loop avantajlidir
        //ama adim sayisi belli olmayan durumlarda while loop daha avantajlidir


        sayi=1;
        toplam=0;

        while (sayi!=0){
            System.out.println("lutfen bir sayi giriniz ");
            sayi= scan.nextInt();
            toplam+=sayi;


        }
    }
}
