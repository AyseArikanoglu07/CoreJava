package day17_forLoop;

public class C07_forLoop {
    public static void main(String[] args) {

        int sayi=85;

        for (int i = 1; i <=sayi ; i++) {
             if(i%3==0 && i%5==0){
                System.out.print("java guzeldır" );
            } else if (i%3==0){
                 System.out.print("Java" );}
             else if (i%5==0){
                 System.out.print("Guzeldir" );
             }else System.out.print(i+" ");






        }
    }
}
