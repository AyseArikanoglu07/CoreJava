package day19_doWhileLoop;

public class C02_WhileLoop {

    public static void main(String[] args) {

        //kullanicidan bir sayi alin
        //sayinin rakamlari toplamini yazdirin

       int input= 3654987;

       int rakam= 0;
       int rakamlarToplami= 0;

       while (input>0){
           rakam=input%10;
           rakamlarToplami+=rakam;
           input/=10;

       }
        System.out.println(rakamlarToplami);
       //sout loopun içinde olursa her bir adımda yazdırır





    }
}
