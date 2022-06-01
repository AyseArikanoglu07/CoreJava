package day19_doWhileLoop;

import java.util.Scanner;

public class C04_doWhileLoop {


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int sayi;
        int toplam=0;
        int sayacPozitif=0;
        int sayacNegatif=0;


        do {
            System.out.println("lutfen poitif bir tamsayi girin ve bitirmek icin 0 a basin");
            sayi=scan.nextInt();
            if (sayi<0){
                System.out.println("Negatif ");
            }else if(sayi>0){
                toplam+=sayi;

            }

        }while (sayi!=0);

        System.out.println("yanlislikla");


        System.out.println("girilen sayilarin toplami : " + toplam);
    }
}
