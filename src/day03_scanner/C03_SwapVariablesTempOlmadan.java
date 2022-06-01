package day03_scanner;

public class C03_SwapVariablesTempOlmadan {


            /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini
        ucuncu bir variable kullanmadan degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */


    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;

        System.out.println("Swaptan once sayi1:"+sayi1+" " + "sayi2:"+sayi2);

        sayi1=sayi2+sayi1;//sayi1 30
        sayi2=sayi1-sayi2;//sayi2 30-20=10
        sayi1=sayi1-sayi2;//sayi1 30-10=20
        System.out.println("Swaptan sonra sayi1:"+sayi1+" "  +  "sayi2:"+sayi2);








    }
}
