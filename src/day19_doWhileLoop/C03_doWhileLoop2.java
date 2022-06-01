package day19_doWhileLoop;

public class C03_doWhileLoop2 {

    public static void main(String[] args) {
        //while loop ile sayidan kucuk pozitif tamsayilari yazdiralim

        int input=3;


        int sayi=1;
        int sayac=1;

        while (sayi<input){
            System.out.println(sayi);
            sayac++;
            sayi++;

        }
        System.out.println("sayac: " + sayac);
        //1,2,3  sayilarini toplamda 3 kez kontrol ediyor iki rakam yazıyor

    }


}
