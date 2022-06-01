package day19_doWhileLoop;

public class C03_doWhileLoop {
    public static void main(String[] args) {
        //while loop ile 5 ten kucuk pozitif tamsayilari yazdiralim


        int sayi=1;
        int sayac=1;

        while (sayi<5){
            System.out.println(sayi);
            sayac++;
            sayi++;

        }
        System.out.println("sayac: " + sayac);
    }
}
